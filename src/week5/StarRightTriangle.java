package week5;

import java.util.Scanner;

public class StarRightTriangle {
    public static void main(String[] args) {
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");

        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
