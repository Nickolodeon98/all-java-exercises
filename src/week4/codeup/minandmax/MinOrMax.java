package week4.codeup.minandmax;

import java.util.List;

public interface MinOrMax<T> {
    boolean compare(int a, int b);
    T numList();
    String getStr();
}
