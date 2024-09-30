package week4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double purch = sc.nextDouble();
        double tax=purch*0.06;
        System.out.println("Sales tax: $"+tax);
    }
}
