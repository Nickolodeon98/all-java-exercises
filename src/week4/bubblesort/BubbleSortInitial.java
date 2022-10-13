package week4.bubblesort;

import java.util.Arrays;

public class BubbleSortInitial {
    public int[] initialSort(int[] array) {
        int temp = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[0] > array[i]) {
                temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        BubbleSortInitial bubbleSortInitial = new BubbleSortInitial();
        int[] array = new int[]{7, 2, 3, 9, 28, 11};

        int[] sortedArray = bubbleSortInitial.initialSort(array);

        System.out.println(Arrays.toString(sortedArray));
    }
}
