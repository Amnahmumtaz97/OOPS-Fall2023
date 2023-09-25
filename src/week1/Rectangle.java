package week1;

public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    // constructor
    Rectangle(int x, int y){
        this.x=y;
        this.y=y;

    }
    public int Area(){
        return length*width;
    }

    public int Perimeter(){
        return 2*(length*width);
    }
    //
//    public static Rectangle getMinimum(Rectangle r1,Rectangle r2){
//        if(r1.Area()>r2.Area()){
//            return r2;
//        }
//        else {
//            return r1;
//        }
//
//        public double getMinimum(Rectangle r1,Rectangle r2){
//            if(r1.Area()>r2.Area()){
//                return r2.Area();
//            }
//            else {
//                return r1.Area();
//            }
    public String intersect(Rectangle r1, Rectangle r2) {
        if ((r1.x + r1.length) > r2.x && (r1.y + r1.width) > r2.y) {
            return "the two rectangles intersect each other";
        } else {
            return "the two rectangles do not intersect each other";
        }
    }
}
