package pl.camp.it.tomwodz.zadania.model;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private int[][] board = new int[4][4];

    public Board() {
        this.board = board;
     /*   board[0][0] = 2;
        board[0][1] = 2;
        board[0][2] = 4;
        board[0][3] = 2;

        board[1][0] = 4;
        board[1][1] = 2;
        board[1][2] = 2;
        board[1][3] = 4;

        board[2][0] = 2;
        board[2][1] = 2;
        board[2][2] = 2;
        board[2][3] = 2;

        board[3][0] = 2;
        board[3][1] = 4;
        board[3][2] = 2;
        board[3][3] = 2;*/
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

}
