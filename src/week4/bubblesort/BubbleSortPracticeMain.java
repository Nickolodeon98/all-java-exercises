package week4.bubblesort;

public class BubbleSortPracticeMain {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        BubbleSortPractice bubbleSortPractice = new BubbleSortPractice(arr);

        bubbleSortPractice.sort();
        System.out.println(bubbleSortPractice.getStrArray());
    }
}
