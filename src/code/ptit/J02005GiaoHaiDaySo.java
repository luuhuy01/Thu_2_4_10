package code.ptit;

import java.util.*;

public class J02005GiaoHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt(), max, min;
        int[] a = new int[n + 5];
        int[] b = new int[m + 5];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        if (n > m){
            max = n;
            min = m;
        }else {
            max = m;
            min = n;
        }
        List<Integer> list = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            int check = 0;
            for (int j = 0; j < min; j++) {
                if (a[i] == b[j]){
                    check ++;
                }
            }
            if (!list.contains(a[i]) && check > 0){
                list.add(a[i]);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.print(i+" ");
        }

    }
}
