package week4.baekjoon.Q3018.temp;

import java.util.*;

public class CampFire {
    private HashMap<Integer, HashSet<Integer>> songAwareness;
    private int population;
    private boolean sunExists;
    private HashSet<Integer> everyPerson;

    public CampFire(int population) {
        this.songAwareness = new HashMap<>();
        this.sunExists = false;
        this.population = population;
        this.everyPerson = new HashSet<Integer>();
        set();
    }

    private void set() {
        for (int i = 1; i <= population; i++) {
            everyPerson.add(i);
        }

        for (int j = 1; j <= population; j++) {
            HashSet<Integer> copy = (HashSet<Integer>) everyPerson.clone();
            copy.remove(j);
            songAwareness.put(j, copy); // songAwareness 맵을 아직까지 못 만난 사람의 목록으로 초기화
        }
    }

    public void findPplKnowingAllSongs(String peopleNameInfo) {
        boolean sunExists = false;
        String[] names = peopleNameInfo.split(" ");

        for (int k = 1; k < names.length; k++) {
            share(names, sunExists, k);
        }
    }

    private void share(String[] giverAndReceiver, boolean addOne, int iterateNum) {
        int toAddMorePpl = Integer.parseInt(giverAndReceiver[iterateNum]);
        HashSet<Integer> listToBeAddedWithMoreSongs = songAwareness.get(toAddMorePpl); // 현재 안 만난 사람들의 목록

        for (int i = 1; i < giverAndReceiver.length; i++) {
            HashSet<Integer> toReceiveFrom = songAwareness.get(Integer.parseInt(giverAndReceiver[i])); // i 번째에 적힌 id의 사람이 아직 안 만난 사람의 목록
            listToBeAddedWithMoreSongs.retainAll(toReceiveFrom); // 업데이트할 안 만난 사람들의 목록에 타겟 사람이 안 만난 사람의 목록과 대조해서 교집합만 남긴다. 예) {1, 3 ,4} {1,3, 7}이면 1, 3만 남을 것이다.
        }

        System.out.println(listToBeAddedWithMoreSongs);
    }
}
