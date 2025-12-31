package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    List<Card> hand = new ArrayList<>();

    Player(String name) {
        this.name = name;
    }

    public int sumRank() {
        int score = 0;
        for (Card card : hand) {
            score += card.getRank();
        }
        return score;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.draw());
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "'s hand: " + hand + " score = " + sumRank());
    }

    public String getName() {
        return name;
    }
}
