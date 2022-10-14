package week4.insertionsort;

public class InsertionSortPractice {
    public int[] sort(int[] arr) {
        int i = 1;

        if (arr[i] < arr[i-1]) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        return arr;
    }
}
