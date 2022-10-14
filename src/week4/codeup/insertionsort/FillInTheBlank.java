package week4.codeup.insertionsort;

import java.util.Scanner;

public class FillInTheBlank {
    private int[] arr;
    private int n, i, j, temp, key;

    public FillInTheBlank(int n, int i, int j, int temp, int key) {
        this.arr = new int[10001];
        this.n = n;
        this.i = i;
        this.j = j;
        this.temp = temp;
        this.key = key;
    }

    public void fill(int n) {
        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        for (i = 2; i <= n; i++) {
            key = arr[i];
            for (j = i-1; j >= 1; j--) {
                if (arr[j+1] < arr[j])
                {
                    arr[j+1] = arr[j];
                }
                arr[j+1] = key;
            }
        }
    }
}
