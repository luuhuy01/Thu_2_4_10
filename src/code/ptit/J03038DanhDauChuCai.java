package code.ptit;

import java.util.Scanner;

public class J03038DanhDauChuCai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
            s = s.replace(s.charAt(i), ' ');
        }
        System.out.println(count);
    }
}
