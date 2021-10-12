package code.ptit;

import java.util.Scanner;

public class J01009TongGiaiThua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long giaiThua = 1;
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            giaiThua *=i;
            ans += giaiThua;
        }
        System.out.println(ans);
    }
}
