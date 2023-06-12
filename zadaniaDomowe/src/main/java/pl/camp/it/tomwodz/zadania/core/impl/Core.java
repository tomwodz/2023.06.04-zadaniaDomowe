package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IBlackjack;
import pl.camp.it.tomwodz.zadania.core.ICaesarShiftCipher;
import pl.camp.it.tomwodz.zadania.core.ICore;
import pl.camp.it.tomwodz.zadania.core.IGameOf2048;
import pl.camp.it.tomwodz.zadania.gui.IGUI;

import java.util.Scanner;

@Component
public class Core implements ICore {

    @Autowired
    IGUI gui;

    @Autowired
    ICaesarShiftCipher caesarShiftCipher;

    @Autowired
    IBlackjack blackjack;

    @Autowired
    IGameOf2048 gameOf2048;

    public void start() {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            gui.menu();
            switch (scanner.nextLine()) {
                case "1":
                    caesarShiftCipher.start();
                    break;
                case "2":
                    blackjack.start();
                    break;
                case "3":
                   gameOf2048.start();
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Zły wybór.");
                    break;
            }
        }
    }

}
