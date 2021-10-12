package code.ptit;

import java.util.Scanner;

public class TN02UocSoNguyenToLN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            long n = in.nextLong();
            System.out.println(usnt(n));
        }
    }

    private static long usnt(long n) {
        long ans = 0;
        long m = (long) Math.sqrt(n);
        if (check(n)) {
            return n;
        }
        long i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n /= i;
                ans = i;
            } else i++;
            if (i > m) {
                break;
            }
        }
        if (n > 1)
            ans = n;
        return ans;
    }

    private static boolean check(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
