package week5;

public class StarPyramidTriangle {

    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarPyramidTriangle starPyramidTriangle = new StarPyramidTriangle();

        starPyramidTriangle.printStar(10);
    }
}
