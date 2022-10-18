package week5;

public class RecursiveStarTriangle {
    public String print(int n, String current) {
        String newCurrent = "";

        if (n == 0) return current;
        else if (n == current.length() || n == current.split("\n")[0].length()) {
            newCurrent = String.join("", "\n", current);
            return print(n - 1, newCurrent);
        }

        newCurrent = String.join("", "*", current);

        return print(n, newCurrent);
    }

    public static void main(String[] args) {
        System.out.println(new RecursiveStarTriangle().print(3, ""));

    }
}
