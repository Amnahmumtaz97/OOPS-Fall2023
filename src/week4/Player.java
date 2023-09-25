package week4;

public class Player {
    Card p1[]=new Card [13];
    Card p2[]=new Card [13];
    Card p3[]=new Card [13];
    Card p4[]=new Card [13];

    Deck card=new Deck();
    public void distribute(Deck deck){
        int count1=0,count2=0,count3=0,count4=0;

        for (int i=51;i>=0;i--)
        {
            if(i%4==0)
            {
                p1[count1++]=card[i];
            }
            else if(i%4==0)
        {
            p2[count1++]=card[i];
        }
            else if(i%4==0)
        {
            p3[count1++]=card[i];
        }
            else if(i%4==0)
        {
            p4[count1++]=card[i];
        }
        }

    }

}
