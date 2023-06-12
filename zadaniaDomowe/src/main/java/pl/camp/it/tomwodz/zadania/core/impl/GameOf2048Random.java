package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048Random;

import java.util.Random;

@Component
public class GameOf2048Random implements IGameOf2048Random {

    Random random = new Random();

    public int[][] random(int[][] board) {
        return randomRek(board, 0, board.length-1);
    }

     public int[][] randomRek(int[][] board, int n, int m) {
         if (n == board.length) {
             return board;
         } else {
             if (m >= 0) {
                 int r = random.nextInt(2);
                 if(r == 0){
                 board[m][n] = 2;}
                 else {
                     board[m][n] = 4;};
                 return randomRek(board, n, m - 1);
             } else {
                 return randomRek(board, n + 1, board.length - 1);
             }
         }
     }
}
