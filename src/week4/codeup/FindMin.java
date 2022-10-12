package week4.codeup;

import java.util.List;

public class FindMin implements MinOrMax<Min> {
    @Override
    public boolean compare(int a, int b) {
        return a > b;
    }

    @Override
    public Min numList() {
        return new Min(-1, "This is minimum number.");
    }
}
