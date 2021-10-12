package code.ptit;

import java.util.Scanner;

public class TN07RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = loaiBoTrungLap(s);
        System.out.println(ans);
    }

    private static String loaiBoTrungLap(String s) {
        int i = kiemTraViTriTrung(s);
        if (i == -2) {
            return "Empty String";
        } else if (i == -1){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder bui = stringBuilder.replace(i,i+2, "");
        return loaiBoTrungLap(bui.toString());
    }

    private static int kiemTraViTriTrung(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return i;
            }
        }
        if (s.isEmpty()) {
            return -2;
        }
        return -1;
    }
}
