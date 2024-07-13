package Recursion;

public class TilingAmazon {
    public static int tilingProblem(int n) {
        // BAse Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // Vertical choice
        int fnm1 = tilingProblem(n - 1);
        // Horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
