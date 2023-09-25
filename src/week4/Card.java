package week4;

public class Card {
    final String rank;
    final String suits;

    public String getRank() {
        return rank;
    }

    public String getSuits() {
        return suits;
    }

    public Card(String rank, String suits) {
        this.rank = rank;
        this.suits = suits;
    }


    public String toString() {
        return String.format("%s of %s",rank,suits);
    }


    public boolean equals(Object o) {
        Card temp = (Card) o;
        return rank.equals(temp.rank) && rank.equals(temp.suits);
    }

//    Card card[] = new Card[52];
//
//    for(int i=0; i<52; i++)
//    {
//        card[i]=new card(suits,rank);
//        System.out.println(card[i]);
//    }

    {

}
}
