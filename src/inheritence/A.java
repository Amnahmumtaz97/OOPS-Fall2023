package inheritence;


public class A {


    A(){
        System.out.println("constructor of A");
    }
    public static void main(String[] args) {

        int x;

        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();

    }
}