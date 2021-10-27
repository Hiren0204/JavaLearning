package Homework;

public class DoWhileTable {
    public static void main(String[] args) {
        int num = 9;
        int q = 1;
        do {
            System.out.println(num + "*" + q + "=" + num * q);
            q++;
// as system multiplies 9 with number 1 to 10 due to which a table of 9 is created.
        } while (q <= 10); // 9<=10
    }
    }
