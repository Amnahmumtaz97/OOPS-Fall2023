package week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {


    private int a;

    public int getA() throws InputMismatchException {
        if (a < 0) {
            throw new InputMismatchException("except");
        }

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
//
//

//    public void exceptionMethod(int a, int b) {
//
//        try{
//            int result=a/b;
//        }
//        catch(ArithmeticException e){
//            int result =0;
//            System.out.println(result);
//            System.out.println("arithmetic exception error");
//
//        }
//        finally{
//            System.out.println("finally");
//        }
//
//    }}

