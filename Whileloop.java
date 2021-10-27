package Homework;

public class Whileloop {
    public static void main(String[] args) {
        System.out.println("Below Numbers are Odd");
        int c = 1;

        while (c < 20) {
            System.out.println(c++);
            c++;

        }
        System.out.println("Below Numbers are even");
        int d = 1;

        while (d <= 20) {
            System.out.println(++d);
            d++;
        }
    }
}


