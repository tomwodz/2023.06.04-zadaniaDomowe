package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048Right;

@Component
public class GameOf2048Right implements IGameOf2048Right {

    public int[][] right(int[][] board){
        return rightRek(board, board.length-1, 0);
    }

    private int[][] rightRek(int[][] board, int n, int m) {
        if (m == board.length) {
            return board;
        }
        else {
            if(n >= 0){
                if(n >= 1 && board[m][n-1] == board[m][n]){
                    board[m][n] = board[m][n] * 2;
                    board[m][n-1] = 0;
                }
                board = rightShift(board, board.length-1, m);
                return rightRek(board, n-1, m);
            }
            else {return rightRek(board, board.length-1, m+1);}}
    }

    private int[][] rightShift(int[][] board, int n, int m) {
        if(n == 0){
            return board;
        }
        else {
            if(board[m][n] == 0){
                int temp = board[m][n-1];
                board[m][n-1] = 0;
                board[m][n] = temp;
            }
            return rightShift(board, n-1, m);}
    }

}
