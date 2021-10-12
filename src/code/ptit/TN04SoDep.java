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
public class TN04SoDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String n = in.nextLine();
            if (check(n))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check(String n) {
        int x = n.length(), k = 0;
        if (x % 2 == 0) {
            k = x / 2;
        } else {
            k = (x + 1) / 2;
        }
        for (int i = 0; i < k; i++) {
            if (n.charAt(i) != n.charAt(x - i - 1) || Integer.parseInt(n.charAt(i) + "") % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
