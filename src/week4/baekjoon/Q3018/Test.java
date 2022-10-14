package week4.baekjoon.Q3018;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> b = new HashMap<>();

        int c = 3;

        b.put(1, c);
        b.put(2, c);
        b.put(2, b.get(2)+1);

        System.out.println(b.get(1));
    }
}
