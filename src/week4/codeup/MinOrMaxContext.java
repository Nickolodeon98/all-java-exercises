package week4.codeup;

public class MinOrMaxContext<T> {
    private MinOrMax<T> minOrMax;

    public MinOrMaxContext(MinOrMax<T> minOrMax) {
        this.minOrMax = minOrMax;
    }

    public int[] findNum(int[] arr) {
        int idx = 0;
        int value = arr[0];

        for (int i = 1; i < arr.length; i++) {
//            System.out.println(elem);
            if (minOrMax.compare(value, arr[i])) {
                value = arr[i];
                idx = i;
            }
        }

//        Max max = null;
//        if (minOrMax instanceof FindMax) {
//            max = (Max) minOrMax.numList();
//            System.out.println(max.getMaxStr());
//        }
//
//        Min min = null;
//        if (minOrMax instanceof FindMin) {
//            min = (Min) minOrMax.numList();
//            System.out.println(min.getMinStr());
//        }
        System.out.println(minOrMax.getStr());

        return new int[]{value, idx};
    }
}
