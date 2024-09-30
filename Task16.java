package week4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(year+"Is a leap year? " + isLeap);
    }
}
