package week4;

import java.util.Random;
public class Deck {
    Card[] deck = new Card[52];

    public Deck() {
        String suits[] = { "Clubs", "Hearts", "Diamonds", "Spades" };
        String rank[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        int counter = 0;

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                deck[counter++] = new Card(rank[i], suits[j]);
            }
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            str.append(deck[i]+"\n");
             }

        return str.toString();
    }

    Random random=new Random();

    public void shuffle(){

     for(int i =0;i<6000;i++) {
        int randomIndex = random.nextInt(52);
        Card temp = deck[randomIndex];
        deck[randomIndex] = deck[0];
        deck[0]=temp;

     }

      }
    }

