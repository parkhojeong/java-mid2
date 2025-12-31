package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int rank;
    private final CardType type;

    public Card(int rank, CardType type) {
        this.rank = rank;
        this.type = type;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + "(" + type.getIcon() + ")";
    }

    @Override
    public int compareTo(Card o) {
        if(rank != o.rank){
            return Integer.compare(rank, o.rank);
        }

        return Integer.compare(type.getPrintOrder(), o.type.getPrintOrder());
    }
}