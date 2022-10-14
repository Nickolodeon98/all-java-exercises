package week4.baekjoon.Q3018;

import java.util.Scanner;

public class KnowSongsMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int population = Integer.parseInt(sc.nextLine());

        KnowSongs knowSongs = new KnowSongs(population);

        int iterateNum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < iterateNum; i++) {
            knowSongs.findPplKnowAllSongs(sc.nextLine());
        }
        knowSongs.printMap();
    }
}
