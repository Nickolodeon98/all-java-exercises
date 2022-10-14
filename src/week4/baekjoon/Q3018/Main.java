package week4.baekjoon.Q3018;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private HashMap<String, HashSet<String>> idAndSongKnowledge;
    private int population;
    public Main(int population) {
        this.population = population;
        this.idAndSongKnowledge = new HashMap<>();
        for (int i = 1; i <= population; i++)
            idAndSongKnowledge.put(String.valueOf(i), new HashSet<String>());
    }

    public void findPplKnowAllSongs(String infoLine, int order) {
        boolean knowSong = false;

        String[] info = infoLine.split("\\s++");
        for (String s : info) {
            knowSong = s.equals("1");
            if (knowSong) break;
        }

        if (knowSong) {
            for (int i = 1; i < info.length; i++) {
                if (this.idAndSongKnowledge.get(info[i]).contains(infoLine))
                    this.idAndSongKnowledge.get(info[i]).add(infoLine + "_" + order);
                else this.idAndSongKnowledge.get(info[i]).add(infoLine);
                this.idAndSongKnowledge.put(info[i], this.idAndSongKnowledge.get(info[i]));
            }
        } else {
            HashSet<String> songs = new HashSet<>();
            for (int j = 1; j < info.length; j++) {
                songs.addAll(idAndSongKnowledge.get(info[j]));
            }

            for (int k = 1; k < info.length; k++) {
                HashSet<String> copySet = new HashSet<>(songs);
                this.idAndSongKnowledge.put(info[k], copySet);
            }
        }
    }

    public void printMap() {
//        int i = 0;
        for (Map.Entry<String, HashSet<String>> eachIdAndSongKnowledge : idAndSongKnowledge.entrySet()) {
            if (idAndSongKnowledge.get("1").equals(eachIdAndSongKnowledge.getValue())) {
                System.out.println(eachIdAndSongKnowledge.getKey());
//                System.out.println(eachIdAndSongKnowledge.getValue());
//                if (i != idAndSongKnowledge.size() - 1) System.out.println();
            }
//            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int population = Integer.parseInt(sc.nextLine());

        Main knowSongs = new Main(population);

        int iterateNum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < iterateNum; i++) {
            knowSongs.findPplKnowAllSongs(sc.nextLine(), i);
        }
        knowSongs.printMap();
    }
}
