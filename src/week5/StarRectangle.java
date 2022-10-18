package week5;

import java.util.Scanner;

public class StarRectangle {
    public void print(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print("*".repeat(x));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        new StarRectangle().print(x, y);
    }
}
