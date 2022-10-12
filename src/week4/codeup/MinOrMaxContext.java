package week4.codeup;

public class MinOrMaxContext<T> {
    private MinOrMax<T> minOrMax;

    public MinOrMaxContext(MinOrMax<T> minOrMax) {
        this.minOrMax = minOrMax;
    }

    public int[] findNum(int[] arr) {
        int maxIdx = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
//            System.out.println(elem);
            if (minOrMax.compare(maxValue, arr[i])) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }

//        System.out.println(minOrMax.numList());

        return new int[]{maxValue, maxIdx};
    }
}
