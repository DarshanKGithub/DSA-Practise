package Recursion;

public class PowN {
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * Power(x, n - 1);
    }

    public static void main(String[] args) {
        // int n = 5;
        System.out.println("Powe of X is : " + Power(2, 10));
    }
}
