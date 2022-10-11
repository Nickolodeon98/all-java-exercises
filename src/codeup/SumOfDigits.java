package codeup;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        while(input != 0) {
            sum += input % 10;
            input /= 10;
            if (input == 0 && sum > 9) {
                input = sum;
                sum = 0;
            }
        }
    }
}
