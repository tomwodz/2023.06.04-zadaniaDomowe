package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048Left;

@Component public class GameOf2048Left implements IGameOf2048Left {

    public int[][] left(int[][] board){
        return leftRek(board, 0, 0);
    }

    private int[][] leftRek(int[][] board, int n, int m) {
        if (m == board.length) {
            return board;
        }
        else {
            if(n <= 3){
                if(n <= 2 && board[m][n+1] == board[m][n]){
                    board[m][n] = board[m][n] * 2;
                    board[m][n+1] = 0;
                }
                board = leftShift(board, 0, m);
                return leftRek(board, n+1, m);
            }
            else {return leftRek(board, 0, m+1);}}
    }

    private int[][] leftShift(int[][] board, int n, int m) {
        if(n == 3){
            return board;
        }
        else {
            if(board[m][n] == 0){
                int temp = board[m][n+1];
                board[m][n+1] = 0;
                board[m][n] = temp;
            }
            return leftShift(board, n+1, m);}
    }

}
