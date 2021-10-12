package code.ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011UCLNSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String a = in.nextLine();
            BigInteger x = new BigInteger(a);
            String b = in.nextLine();
            BigInteger y = new BigInteger(b);
            System.out.println(x.gcd(y));
        }
    }
}
