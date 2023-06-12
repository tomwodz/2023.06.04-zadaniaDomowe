package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IBlackjack;
import pl.camp.it.tomwodz.zadania.core.IBlackjackVer;
import pl.camp.it.tomwodz.zadania.model.Cards;

import java.util.Arrays;
import java.util.Scanner;

@Component
public class Blackjack implements IBlackjack {

    @Autowired
    IBlackjackVer blackjackVer;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę przypadków testowych: ");
        int run = 0;
        int runMax = Integer.parseInt(scanner.nextLine());
        String[] result = new String[runMax];
        while (run < runMax) {
            String str = scanner.nextLine();
            String[] strText = str.split(" ");
            int counterAce = 0;

            for (int i = 0; i < strText.length; i++) {
                counterAce = counterAce + blackjackVer.verificationAce(strText[i]);
            }
            int sum = 0;
            for (int i = 0; i < strText.length; i++) {
                sum = sum + blackjackVer.verification(strText[i]);
                if (sum > 21 || sum + counterAce > 21) {
                    break;
                }
            }
            int res = blackjackVer.verificationFinish(sum + counterAce, counterAce);
            if (res > 21) {
                result[run] = "Bust";
            }
            else {
                result[run] = Integer.toString(res);
            }
            run++;
        }

        System.out.println("Wynik:");
        System.out.println(Arrays.toString(result));
    }
}
