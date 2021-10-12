/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;

import java.util.Scanner;

/**
 * @author luuhu
 */
public class J02004MangDoiXung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(check(a));
        }
    }

    private static String check(int[] n) {
        int x = n.length, k = 0;
        if (x % 2 == 0) {
            k = x / 2;
        } else {
            k = (x + 1) / 2;
        }
        for (int i = 0; i < k; i++) {
            if (n[i] != n[x - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
}
