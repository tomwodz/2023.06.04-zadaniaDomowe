package pl.camp.it.tomwodz.zadania.model;

import org.springframework.stereotype.Component;

@Component
public class Cards {
    private String[] cards;
    private int[] cardsVaule;

    public Cards() {
        this.cards = new String[]{"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
        this.cardsVaule = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,0};
    }
    public String[] getCards() {
        return cards;
    }

    public int[] getCardsVaule() {
        return cardsVaule;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }

}
