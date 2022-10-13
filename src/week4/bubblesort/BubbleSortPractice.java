package week4.bubblesort;

import java.util.Arrays;

public class BubbleSortPractice {
    private int[] array;

    public BubbleSortPractice(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public String getStrArray() {
        return Arrays.toString(array);
    }
}
