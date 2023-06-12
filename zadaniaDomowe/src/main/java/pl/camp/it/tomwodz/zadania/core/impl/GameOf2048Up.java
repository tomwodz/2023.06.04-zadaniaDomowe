package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048Up;

@Component
public class GameOf2048Up implements IGameOf2048Up {
    public int[][] up(int[][] board){
        return upRek(board, 0, 0);
    }

    private int[][] upRek(int[][] board, int n, int m) {
        if (n == board.length) {
            return board;
        }
        else {
            if(m <= 3){
                if(m <= 2 && board[m][n] == board[m+1][n]){
                    board[m][n] = board[m][n] * 2;
                    board[m+1][n] = 0;
                }
                board = upShift(board, n, 0);
                return upRek(board, n, m+1);
            }
            else {return upRek(board, n+1, 0);}}
    }

    private int[][] upShift(int[][] board, int n, int m) {
        if(m == 3){
            return board;
        }
        else {
            if(board[m][n] == 0){
                int temp = board[m+1][n];
                board[m+1][n] = 0;
                board[m][n] = temp;
            }
            return upShift(board, n, m+1);}
    }
}
