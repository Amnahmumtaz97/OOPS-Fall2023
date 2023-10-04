package inheritence;


public class A {

    int x;
    int y;

    A(int a, int b){
        super();
        System.out.println("constructor of A");
    }

    public static void main(String[] args) {


        A a=new A(2,3);
        B b=new B(4,5,6,7);
        C c=new C(8,9,2,4);
        D d=new D(6,3,1,0);

    }
}