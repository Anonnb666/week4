package week4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int lottery = sc.nextInt();
        String formatted = String.format("%02d", lottery);
        System.out.println("Your formatted lottery pick is: " + formatted);
    }
}
