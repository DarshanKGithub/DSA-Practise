package Recursion;

public class Fibonnaci {
    public static int printFib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        int fibnm1 = printFib(n - 1);
        int fibnm2 = printFib(n - 2);
        int fibn = fibnm1 + fibnm2;

        return fibn;
    }

    public static void main(String[] args) {
        int n = 5000;
        System.out.println(printFib(n));
    }
}
