package code.ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TN13SapXepCongViec implements Comparable<TN13SapXepCongViec>{

    public int start;
    public int finish;

    public TN13SapXepCongViec(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            List<TN13SapXepCongViec> job = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int start = in.nextInt();
                int finish = in.nextInt();
                job.add(new TN13SapXepCongViec(start, finish));
            }

            Collections.sort(job);

            int count = 1, j =0;
            for (int i = 0; i < n; i++) {
                if (job.get(j).finish <= job.get(i).start) {
                    count++;
                    j = i;
                }
            }
            System.out.println(count);
        }
    }

    private static void swap(int[] finish, int i, int j) {
        int temp1 = finish[i];
        finish[i] = finish[j];
        finish[j] = temp1;
    }

    @Override
    public int compareTo(TN13SapXepCongViec o) {
        if (this.finish > o.finish)
            return 1;
        else if (this.finish < o.finish)
            return -1;
        else
            return 0;
    }
}
