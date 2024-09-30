package week4;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int x=1,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        a = sc.nextInt();
        if(a==1)x+=5;
        else if(a==2)x+=10;
        else if(a==3)x+=16;
        else if(a==4)x+=34;
    }
}
