package week4.insertionsort;

public class InsertionSortPractice {
    public int[] sort(int[] arr, int i) {
        int j = i;

        if (arr[j] < arr[j-1]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }

        return arr;
    }
}
