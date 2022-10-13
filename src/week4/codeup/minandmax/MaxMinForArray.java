package week4.codeup.minandmax;

public class MaxMinForArray {
    public int[] getMax(int[] arr) {
        int maxIdx = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }

        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        MaxMinForArray max01 = new MaxMinForArray();
        MinOrMaxContext<Max> maxContext = new MinOrMaxContext<>(new FindMax());
        MinOrMaxContext<Min> minContext = new MinOrMaxContext<>(new FindMin());

        int[] maxResult = minContext.findNum(arr);
        int[] minResult = maxContext.findNum(arr);

        if (maxResult[0] == 85) System.out.println("테스트 통과입니다.");
        else System.out.println("테스트 실패입니다.");

        if(minResult[0] == 3) System.out.println("테스트 통과입니다.");
        else System.out.println("테스트 실패입니다.");
    }
}
