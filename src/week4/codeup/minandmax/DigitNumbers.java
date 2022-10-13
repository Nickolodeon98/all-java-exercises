package week4.codeup.minandmax;

import java.util.Scanner;

public class DigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int input = sc.nextInt();

        int cnt = 0;

        while (input != 0) { // input = 4322 -> input = 432 -> input 43 -> input 4
            input /= 10;
            cnt++;
        }

        System.out.println(cnt);
    }
}
