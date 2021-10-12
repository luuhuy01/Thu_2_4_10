package code.ptit;

import java.util.Scanner;

public class TN12ToHopTiepTheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[k + 5];
            int[] b = new int[k + 5];
            for (int i = 1; i <= k; i++) {
                a[i] = scanner.nextInt();
                b[i] = a[i];
            }
            int i = k;
            while (i > 0 && a[i] == n - k + i)
                i--;
            a[i]++;
            if (i > 0) {
                for (int j = i + 1; j <= k; j++)
                    a[j] = a[i] + j - i;

                int count = 0;
                for (int j = 1; j <= k; j++) {
                    int check = 0;
                    for (int q = 1; q <= k; q++) {
                        if (b[j] == a[q]) {
                            check++;
                        }
                    }
                    if (check == 0) {
                        count++;
                    }
                }
                System.out.println(count);
            } else {
                System.out.println(k);
            }

        }
    }
}
