package Homework;

public class OddevenLoop {
    public static void main(String[] args) {

        {
            System.out.println("Below numbers are Odd");
            for (int f = 3; f <= 20; f++) {
                System.out.println(f++);
                System.out.println("Below Numbers even");
                {
                        for (int g = 2; g <= 20; ++g)
                        System.out.println(g++);


                    }
                }
            }
        }
    }