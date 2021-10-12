package code.ptit;

import java.util.Locale;
import java.util.Scanner;

public class TN05ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    private static String chuanHoa(String s) {
        String sReplace = s.trim().replaceAll("\\s++", " ").toLowerCase();
        String [] stringProcess = sReplace.split(" ");
        String ans = "";
        for (int i =0; i< stringProcess.length; i++){
            String x = String.valueOf(stringProcess[i].charAt(0)).toUpperCase() + stringProcess[i].substring(1);
            ans += x;
            if (i < stringProcess.length - 1){
                ans += " ";
            }
        }
        return ans;
    }
}
