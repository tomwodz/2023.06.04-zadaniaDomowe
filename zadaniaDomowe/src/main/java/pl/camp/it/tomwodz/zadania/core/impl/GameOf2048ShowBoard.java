package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048ShowBoard;

@Component
public class GameOf2048ShowBoard implements IGameOf2048ShowBoard {
    public void showBoard(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j= 0; j < board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
