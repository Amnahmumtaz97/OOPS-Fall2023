package week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {
//
//        int a;
//        int b;
//
//        System.out.println("welcome");
//        Scanner input= new Scanner(System.in);
//
//        try{
//            a = input.nextInt();
//            b = input.nextInt();
//
//            System.out.println("Answer of a/b is = "+(a/b));
//
//        }
//        catch (InputMismatchException e){
//            System.out.println("input mismatch");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("arithmetic exception");
//        }
//        catch (RuntimeException e){
//            System.out.println("runtime exception");
//
//        }
//        finally{
//            System.out.println("finally block executed");
//        }
//        System.out.println("program ended");
//
//        try{
//            File file2=new File("data.txt");
//            File file1=new File("data.txt");
//            FileReader fr=new FileReader(file1);
//        }
//        catch (FileNotFoundException e){
//            System.out.println("file not found exception here");
//        }
//        finally{
//            System.out.println("finally block executed here");
//        }
//
//
//            File file1=new File("data.txt");
//            FileReader fr=new FileReader(file1);
//

                A objectA = new A();
                objectA.setA(-9);
                try {
                    int result = objectA.getA();
                    System.out.println("Result: " + result);
                } catch (InputMismatchException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }


//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        A obj = new A();
//        obj.exceptionMethod(a,b);

     }
    }
