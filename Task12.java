package week4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("HiFive");
        }
        if(n%2==0){
            System.out.println("HiEven");
        }
    }
}
