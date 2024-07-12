package Recursion;

public class DecreasingOrder {
    // Method by Recursion

    public static void printDec(int n) {
        // condition
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
