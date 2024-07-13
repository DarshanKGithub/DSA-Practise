package Recursion;

public class OptPowN {
    public static int OptimizedPowN(int a, int n) {
        // best case
        if (n == 0) {
            return 1;

        }
        // int halfPowerSq = OptimizedPowN(a, n / 2) * OptimizedPowN(a, n / 2);
        int halfPower = OptimizedPowN(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;

        System.out.println(OptimizedPowN(a, n));

    }
}
