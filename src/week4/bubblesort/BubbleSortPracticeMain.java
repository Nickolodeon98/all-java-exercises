package week4.bubblesort;

public class BubbleSortPracticeMain {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 22, 3, 2, 28, 11};
        BubbleSortPractice bubbleSortPractice = new BubbleSortPractice(arr);

        bubbleSortPractice.sort();
        System.out.println(bubbleSortPractice.getStrArray());
    }
}
