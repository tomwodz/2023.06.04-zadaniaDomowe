package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.IBlackjackVer;
import pl.camp.it.tomwodz.zadania.model.Cards;

@Component
public class BlackjackVer implements IBlackjackVer {

    @Autowired
    private Cards cards;
    public int verification(String str){
        return verificationRek(str, cards.getCards(), cards.getCardsVaule(),0);
    }

    private int verificationRek(String str, String[] cards, int[] cardsVaule, int n){
        if(n == cards.length){
            return 0;
        }
        else {
            if(str.equals(cards[n])){
                return cardsVaule[n];
            }
            else {
                return verificationRek(str, cards, cardsVaule, n+1);
            }
        }
    }

    public int verificationAce(String str){
       if(str.equals("A")){
           return 1;
       }
       else return 0;
    }

    public int verificationFinish(int sumPlusCounterAce, int counterAce){
        if(21 - sumPlusCounterAce >= 10 && counterAce > 0){
            sumPlusCounterAce = sumPlusCounterAce + 10;
            return verificationFinish(sumPlusCounterAce, counterAce-1);
        }
        return sumPlusCounterAce;
    }

}
