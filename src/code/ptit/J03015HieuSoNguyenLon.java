package code.ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String m = in.nextLine();
        BigInteger a = new BigInteger(n);
        BigInteger b = new BigInteger(m);
        System.out.println(a.subtract(b));
    }
}
