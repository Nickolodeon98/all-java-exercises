package week4.baekjoon.Q3018.temp;

public class CampFireMain {
    public static void main(String[] args) {
        CampFire campFire = new CampFire(4);

        String infoLine = " 2 1 2";
        String infoLine2 = "3 2 3 4";
        String infoLine3 = "3 4 2 1";

        campFire.findPplKnowingAllSongs(infoLine);
        campFire.findPplKnowingAllSongs(infoLine2);
        campFire.findPplKnowingAllSongs(infoLine3);
    }
}
