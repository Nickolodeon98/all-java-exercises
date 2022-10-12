package week4.codeup;

import java.util.Scanner;

public class Max01 {
    public int getMax(int[] arr) {
        int maxValue = 0;

        for (int elem : arr) {
//            System.out.println(elem);
            if (maxValue < elem) maxValue = elem;
        }

        return maxValue;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int read = sc.nextInt();
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        Max01 max01 = new Max01();

        int result = max01.getMax(arr);

        if (result == 85) System.out.println("테스트 통과입니다.");
        else System.out.println("테스트 실패입니다.");
    }
}
