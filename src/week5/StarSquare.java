package week5;

import java.util.Scanner;

public class StarSquare {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        StarSquare starSquare = new StarSquare();
        starSquare.print(num);
    }
}
