package week4.bubblesort;

import java.util.Arrays;

public class BubbleSortPractice {
    private int[] array;

    public BubbleSortPractice(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public String getStrArray() {
        return Arrays.toString(array);
    }
}
