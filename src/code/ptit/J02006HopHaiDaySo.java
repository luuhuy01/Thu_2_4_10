package code.ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J02006HopHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (!ans.contains(a.get(i))){
                ans.add(a.get(i));
            }
        }
        for (int i = 0; i < m; i++) {
            if (!ans.contains(b.get(i))){
                ans.add(b.get(i));
            }
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
