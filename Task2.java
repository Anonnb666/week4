package week4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second: ");
        double second = sc.nextInt();
        double minutes=second/60;
        double remainder=second%60;

        System.out.println(minutes+":"+remainder);
    }
}
