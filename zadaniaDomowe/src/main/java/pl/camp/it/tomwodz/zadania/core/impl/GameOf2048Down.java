package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048Down;

@Component
public class GameOf2048Down implements IGameOf2048Down {
    public int[][] down(int[][] board){
        return downRek(board, 0, board.length-1);
    }

    private int[][] downRek(int[][] board, int n, int m) {
        if (n == board.length) {
            return board;
        }
        else {
            if(m >= 0){
                if(m >= 1 && board[m][n] == board[m-1][n]){
                    board[m][n] = board[m][n] * 2;
                    board[m-1][n] = 0;
                }
                board = downShift(board, n, board.length-1);
                return downRek(board, n, m-1);
            }
            else {return downRek(board, n+1, board.length-1);}}
    }

    private int[][] downShift(int[][] board, int n, int m) {
        if(m == 0){
            return board;
        }
        else {
            if(board[m][n] == 0){
                int temp = board[m-1][n];
                board[m-1][n] = 0;
                board[m][n] = temp;
            }
            return downShift(board, n, m-1);}
    }
}
