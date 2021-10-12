package code.ptit;

import java.util.Arrays;
import java.util.Scanner;

public class TN28TongNhoNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            String p = "";
            String q = "";
            long x = 0;
            long y = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    p += a[i] + "";
                } else
                    q += a[i] + "";
            }
            x = Long.parseLong(p);
            y = Long.parseLong(q);
            System.out.println(x + y);
        }
    }
}