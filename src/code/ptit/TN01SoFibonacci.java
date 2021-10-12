package code.ptit;

import java.util.Scanner;

public class TN01SoFibonacci {

    public static long[] a = new long[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < 93; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.nextLine());
            System.out.println(fibo(n));
        }
    }

    private static long fibo(int n) {
        return a[n - 1];
    }
}

