package code.ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014TongHaiSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.nextLine());
        BigInteger b = new BigInteger(in.nextLine());
        System.out.println(a.add(b));
    }
}
