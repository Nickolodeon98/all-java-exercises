package week4.baekjoon;

import java.util.HashMap;
import java.util.Map;

public class CampFire {
    private HashMap<Integer, Integer> songAwareness;

    private boolean sunExists;

    public CampFire(HashMap<Integer, Integer> songAwareness) {
        this.songAwareness = songAwareness;
        this.sunExists = false;
    }

    public void knowSongs(String line) {
        String[] participants = line.split(" ");

        for (String participant : participants) {
            if (Integer.parseInt(participant) == 1) sunExists = true;
            if (songAwareness.get(Integer.parseInt(participant)) != null) {
                songAwareness.put(Integer.parseInt(participant), songAwareness.get(Integer.parseInt(participant)) + 1);
            }
        }

        if (sunExists) {

            for (Map.Entry eachLearnSong : songAwareness.entrySet()) {

                System.out.println(eachLearnSong.getValue().toString());
            }
        }
    }
}
