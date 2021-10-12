package code.ptit;

import java.util.Scanner;

public class TN09HoanViKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a[] = new int[n + 5];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            int i = n - 1;
            while (i > 0 && a[i] > a[i+1])
                i--;
            if (i <= 0){
                for (int j = 1; j <= n; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }else {
                int k = n;
                while (a[k] < a[i]){
                    k--;
                }
                swap(a, k, i);

                int l = i+1, r = n;
                while(l < r){
                    swap(a, l, r);
                    l++; r--;
                }
                for (int j = 1; j <= n; j++) {
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }

        }
    }

    private static void swap(int[] a, int k, int x) {
        int temp = a[x];
        a[x] = a[k];
        a[k] = temp;
    }
}
