package week4.baekjoon.Q3018;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KnowSongs {
    private HashMap<String, HashSet<String>> idAndSongKnowledge;
    private int population;
    public KnowSongs(int population) {
        this.population = population;
        this.idAndSongKnowledge = new HashMap<>();
        for (int i = 1; i <= population; i++)
            idAndSongKnowledge.put(String.valueOf(i), new HashSet<String>());
    }

    public void findPplKnowAllSongs(String infoLine) {
        boolean knowSong = false;

        String[] info = infoLine.split("\\s++");
        for (String s : info) {
            knowSong = s.equals("1");
            if (knowSong) break;
        }

        if (knowSong) {
            for (int i = 1; i < info.length; i++) {
                System.out.println(info[1]);
                this.idAndSongKnowledge.get(info[i]).add(infoLine);
                this.idAndSongKnowledge.put(info[i], this.idAndSongKnowledge.get(info[i]));
                System.out.println("this: " + idAndSongKnowledge);
            }
        } else {
            HashSet<String> songs = new HashSet<>();
            for (int j = 1; j < info.length; j++) {
                songs.addAll(idAndSongKnowledge.get(info[j]));
                System.out.println("Songs: " + songs);
            }

            for (int k = 1; k < info.length; k++) {
                HashSet<String> copySet = (HashSet<String>) songs.clone();
                this.idAndSongKnowledge.put(info[k], copySet);
                System.out.println("changed map: " + idAndSongKnowledge);
            }
        }
    }

    public void printMap() {
        int i = 0;
        for (Map.Entry<String, HashSet<String>> eachIdAndSongKnowledge : idAndSongKnowledge.entrySet()) {
            if (idAndSongKnowledge.get("1").equals(eachIdAndSongKnowledge.getValue())) {
                System.out.print(eachIdAndSongKnowledge.getKey() + eachIdAndSongKnowledge.getValue());
                if (i != idAndSongKnowledge.size() - 1) System.out.println();
            }

            i++;
        }
    }
}
