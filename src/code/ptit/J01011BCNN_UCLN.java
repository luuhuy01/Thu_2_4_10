package code.ptit;

import java.util.Scanner;

public class J01011BCNN_UCLN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            System.out.println(bcnn(a, b) + " " + ucln(a, b));
        }
    }

    private static long bcnn(long a, long b) {
        return a * b / ucln(a, b);
    }

    private static long ucln(long a, long b) {
        if (a == 0) {
            return b;
        }
        return ucln(b % a, a);
    }
}
