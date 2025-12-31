package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("player1");
        Player player2 = new Player("palyer2");

        for (int i1 = 0; i1 < 5; i1++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = findWinner(player1, player2);

        if(winner != null) {
            System.out.println("drow");
        } else{
            System.out.println(winner.getName());
        }
    }

    static Player findWinner(Player player1, Player player2) {
        int score1 = player1.sumRank();
        int score2 = player2.sumRank();

        if(score1 > score2) {
            return player1;
        } else if(score1 < score2) {
            return player2;
        } else{
            return null;
        }
    }
}
