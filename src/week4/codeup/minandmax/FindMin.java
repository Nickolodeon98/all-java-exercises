package week4.codeup.minandmax;

public class FindMin implements MinOrMax<Min> {
    @Override
    public boolean compare(int a, int b) {
        return a > b;
    }

    @Override
    public Min numList() {
        return new Min(-1, "This is minimum number.");
    }

    @Override
    public String getStr() {
        Min min = new Min(-1, "This is a minimum number");
        return min.getMinStr();
    }
}
