package week3;

public class Main {
    public static void main(String[] args) {
        Music myMusic1 = new Music("song", "twelve", "eight", new Date(1, 2, 2023),
                new Singer("alina", "female", "pakistan", new Date(2, 9, 2018)));


        Music myMusic2 = new Music("hehe", "eleven", "nine", new Date(3, 4, 2022),
                new Singer("ahmad", "male", "england", new Date(7, 5, 2019)));

        System.out.println(myMusic1);
        System.out.println();

        System.out.println(myMusic2);
        System.out.println();

        System.out.println(myMusic2.equals(myMusic1));
    }
}

