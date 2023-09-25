package week2;

public class RecTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(6,8);

        System.out.println("x1:"+r1.getX());
        System.out.println("x2:"+r2.getX());

        System.out.println("y1:"+r1.getY());
        System.out.println("y2:"+r2.getY());

        r1.setLength(1);
        r1.setWidth(3);

        r2.setLength(8);
        r2.setWidth(2);

        System.out.println("length1:"+r1.getLength());
        System.out.println("length2:"+r2.getLength());

        System.out.println("width1:"+r1.getWidth());
        System.out.println("width2:"+r2.getWidth());

//        System.out.println("area1:"+r1.Area());
//        System.out.println("perimeter1:"+r1.Perimeter());
//
//        System.out.println("area2:"+r2.Area());
//        System.out.println("perimeter2:"+r2.Perimeter());

//        Rectangle smallRec=r1.getMinimum(r1,r2);
//        System.out.println(smallRec);
//        System.out.println(r1.getMinimum(r1,r2));

        System.out.println(r1.intersect(r1,r2));



    }
}
