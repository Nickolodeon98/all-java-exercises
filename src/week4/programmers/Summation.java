package week4.programmers;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0; // 각 자릿수 숫자들의 합을 저장하는 정수형 변수

        while (input != 0) { // 10으로 나누었을 때 몫이 0이 되기 전까지 (즉, 모든 각 자릿수들의 숫자들을 찾아서 더한 후)
            sum += input % 10;
            input /= 10;
        }
    }
}
