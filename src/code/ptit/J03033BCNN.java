package code.ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033BCNN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0){
            String m = in.nextLine();
            String n = in.nextLine();
            BigInteger a = new BigInteger(m);
            BigInteger b = new BigInteger(n);
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
