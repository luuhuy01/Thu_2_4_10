package code.ptit;

import java.util.Scanner;

public class TN08XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String s = scanner.nextLine();
            int n = s.length() - 1;
            while (n >= 0 && s.charAt(n) == '1') n--;
            StringBuffer stringBuffer = new StringBuffer(s);
            if (n >= 0)
                stringBuffer.replace(n, n+1, "1");
            for(int i = n+1; i < s.length(); i++){
                stringBuffer.replace(i, i+1, "0");
            }
            System.out.println(stringBuffer);
        }
    }
}
