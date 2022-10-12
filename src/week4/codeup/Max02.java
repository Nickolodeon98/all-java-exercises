package week4.codeup;

public class Max02 {
    public int[] getMax(int[] arr, int maxValue, int maxIdx) {
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        Max02 max = new Max02();

        int[][] grid = new int[][]{
                {3,23,85,34,17,74,25,52,65},
                {10,7,39,42,88,52,14,72,63},
                {87,42,18,78,53,45,18,84,53},
                {34,28,64,85,12,16,75,36,55},
                {21,77,45,35,28,75,90,76,1},
                {25,87,65,15,28,11,37,28,74},
                {65,27,75,41,7,89,78,64,39},
                {47,47,70,45,23,65,3,41,44},
                {87,13,82,38,31,12,29,29,80}
        };

        int maxValue = grid[0][0];
        int[] info;
        int rowValue = 0;
        int columnValue = 0;

        for (int i = 0; i < grid.length; i++) {
            info = max.getMax(grid[i], maxValue, columnValue);
            if (maxValue != info[0]) rowValue = i;
            maxValue = info[0];
            columnValue = info[1];
        }

        System.out.printf("최대값은 %d 이고 %d 행 %d 열에 위치합니다.", maxValue, rowValue+1, columnValue+1);

    }
}
