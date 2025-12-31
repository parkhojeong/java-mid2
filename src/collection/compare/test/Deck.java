package collection.compare.test;

import java.util.*;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (CardType cardType : CardType.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(i, cardType));
            }
        }
    }

    public void shuffle() {
           Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.removeFirst();
    }
}
