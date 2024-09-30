package week4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        if(n%2==0&&n%3==0) {
            System.out.println(n+"is divisible by 2 and 3");
        }
        if(n%2==0||n%3==0) {
            System.out.println(n+"is divisible by 2 or 3");
        }
        if(n%2==0^n%3==0) {
            System.out.println(n+"is divisible by 2 or 3, but not both");
        }
    }
}
