package week4.codeup.upgradebubblesort;

public class Q3011BubbleSortImproved {
    private int[] arrToSort;

    public Q3011BubbleSortImproved(int[] arrToSort) {
        this.arrToSort = arrToSort;
    }

    public void findSorted() {
        boolean swapped = false;

        for (int i = 0; i < arrToSort.length; i++) {
            for (int j = 1; j < arrToSort.length; j++) {
                if (arrToSort[j] < arrToSort[j-1]) {
                    int temp = arrToSort[j - 1];
                    arrToSort[j - 1] = arrToSort[j];
                    arrToSort[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println(i);
                break;
            }
            swapped =false;
        }
    }
}
