package code.ptit;

import java.util.Arrays;
import java.util.Scanner;

public class TN03TongCacChuSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            System.out.println(processString(s));
        }
    }

    private static String processString(String s) {
        String ans = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += s.charAt(i);
            } else {
                sum += Integer.parseInt(s.charAt(i) + "");
            }
        }
        char[] c = ans.toCharArray();
        Arrays.sort(c);
        String ans1 = new String(c);
        return ans1 + sum;
    }


}
