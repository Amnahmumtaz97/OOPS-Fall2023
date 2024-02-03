package week4;

public class Main {
    public static void main(String[] args) {

        Card c1 = new Card("Ace", "Clubs");
        Card c2 = new Card("Jack", "Clubs");

        System.out.println(c1.equals(c2));

        Card deck[] = new Card[52];
        deck[0] = c2;
        Card c3 = deck[3];
        //

        System.out.println(deck[3]);

        Deck card = new Deck();
        System.out.println(card);

        card.shuffle();
        System.out.println(card);

        Player p = new Player();
        p.distribute(card); //to distribute the cards
        //print the cards assigned to players
        System.out.println(p.toString());

    }

}
