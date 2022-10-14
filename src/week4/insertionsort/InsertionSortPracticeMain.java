package week4.insertionsort;

import java.util.Arrays;

public class InsertionSortPracticeMain {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSortPractice insertionSortPractice = new InsertionSortPractice();
        int[] resultArr = insertionSortPractice.sort(arr, 1);



        System.out.println(Arrays.toString(resultArr));
    }
}
