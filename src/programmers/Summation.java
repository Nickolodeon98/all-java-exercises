package programmers;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        while (input != 0) {
            sum += input % 10; // sum = 123 % 10 = 3
            input /= 10; // 123 / 10 = 12
        }
    }
}
