package code.ptit;

import java.util.*;

public class TN06DiaChiEmail {
    static Set<String> stringList = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            String ans = chuanHoa(s);
            int count = 1;
            String check = ans;
            while (stringList.contains(check) || stringList.contains(ans + count)){
                count ++;
                check = check + count;
            }
            if (count != 1){
                ans = ans + count;
            }
            stringList.add(ans);
            ans += "@ptit.edu.vn";

            System.out.println(ans);
        }
    }

    private static String chuanHoa(String s) {
        String sReplace = s.trim().replaceAll("\\s++", " ").toLowerCase();
        String [] arr = sReplace.split(" ");
        StringBuilder builder = new StringBuilder("");
        builder.append(arr[arr.length-1]);
        for (int i = 0; i < arr.length - 1; i++){
            builder.append(arr[i].charAt(0));
        }
        return builder.toString();
    }
}
