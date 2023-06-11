package pl.camp.it.tomwodz.zadania.gui.impl;

import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.gui.IGUI;

@Component
public class GUI implements IGUI {

    public void menu(){
        System.out.println("1. Caesar Shift Cipher");
        System.out.println("2. Black Jack");
        System.out.println("3. Exit");
    }
}
