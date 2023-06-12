package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.*;
import pl.camp.it.tomwodz.zadania.model.Board;

import java.util.Scanner;

@Component
public class GameOf2048 implements IGameOf2048 {

    @Autowired
    private Board board;

    @Autowired
    private IGameOf2048Down down;

    @Autowired
    private IGameOf2048Up up;

    @Autowired
    private IGameOf2048ShowBoard showBoard;

    @Autowired
    private IGameOf2048Right right;

    @Autowired
    private IGameOf2048Left left;

    @Autowired
    private IGameOf2048Random random;

    public void start(){
        Scanner scanner = new Scanner(System.in);
        board.setBoard(random.random(board.getBoard()));
        showBoard.showBoard(board.getBoard());
        boolean run = true;
        while (run){
            switch (scanner.nextLine()){
                case "D":
                    down.down(board.getBoard());
                    break;
                case "U":
                   up.up(board.getBoard());
                    break;
                case "R":
                    right.right(board.getBoard());
                    break;
                case "L":
                    left.left(board.getBoard());
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    break;
            }
            showBoard.showBoard(board.getBoard());
        }

    }



}
