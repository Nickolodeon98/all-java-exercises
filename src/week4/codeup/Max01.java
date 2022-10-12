package week4.codeup;

import java.util.Scanner;

public class Max01 {
    public int[] getMax(int[] arr) {
        int maxIdx = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
//            System.out.println(elem);
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }

        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int read = sc.nextInt();
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        Max01 max01 = new Max01();
        MinOrMaxContext minOrMaxContext = new MinOrMaxContext(new FindMax());
//        int[] result = max01.getMax(arr);
        int[] result = minOrMaxContext.findNum(arr);

        if (result[0] == 85) System.out.println("테스트 통과입니다.");
        else System.out.println("테스트 실패입니다.");
    }
}
