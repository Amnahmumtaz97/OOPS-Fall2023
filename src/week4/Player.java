package week4;

public class Player {
    Card p1[] = new Card[13];
    Card p2[] = new Card[13];
    Card p3[] = new Card[13];
    Card p4[] = new Card[13];

    Deck card = new Deck();

    public void distribute(Deck deck) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

            for (int i = 51; i >= 0; i--) {
                if (i % 4 == 0) {
                    p1[count1++] = deck.deck[i];
                } else if (i % 4 == 1) {
                    p2[count2++] = deck.deck[i];
                } else if (i % 4 == 2) {
                    p3[count3++] = deck.deck[i];
                } else {
                    p4[count4++] = deck.deck[i];
                }
            }
        }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Player 1:\n");
        for (int i = 0; i < 13; i++) {
            str.append(p1[i] + "\n");
        }
        str.append("Player 2:\n");
        for (int i = 0; i < 13; i++) {
            str.append(p2[i] + "\n");
        }
        str.append("Player 3:\n");
        for (int i = 0; i < 13; i++) {
            str.append(p3[i] + "\n");
        }
        str.append("Player 4:\n");
        for (int i = 0; i < 13; i++) {
            str.append(p4[i] + "\n");
        }
        return str.toString();
    }
}
