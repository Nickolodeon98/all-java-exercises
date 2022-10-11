import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int length = String.valueOf(input).length();

        int sum = 0;

        for (int i = length-1; i >= 0; i--) {
            sum += input / Math.pow(10, i);
            System.out.println(sum);
            input -= (input / Math.pow(10, i) * Math.pow(10, length));
        }

        System.out.println(sum);
    }
}
