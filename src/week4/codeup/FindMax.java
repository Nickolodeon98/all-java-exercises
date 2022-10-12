package week4.codeup;

import java.util.List;

public class FindMax implements MinOrMax<Max>{
    @Override
    public boolean compare(int a, int b) {
        return a < b;
    }

    @Override
    public Max numList() {
        return new Max(99, "This is maximum number");
    }

    @Override
    public String getStr() {
        Max max = new Max(99, "This is a maximum number");
        return max.getMaxStr();
    }
}
