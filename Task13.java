package week4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pay: ");
        double pay = sc.nextDouble();
        System.out.println("Enter score: ");
        double score = sc.nextDouble();
        if (score > 90) {
            pay += pay * 0.03;
        } else {
            pay += pay * 0.01;
        }

        System.out.println(pay);
    }
}

