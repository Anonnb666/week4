package week4;

import java.util.Random;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = scanner.nextInt();

        if (answer == number1 + number2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
