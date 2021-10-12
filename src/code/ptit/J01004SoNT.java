/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;

import java.util.Scanner;

/**
 *
 * @author luuhuy
 */
public class J01004SoNT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.nextLine());
            System.out.println(check(n));
        }
    }

    private static String check(int n) {
         //To change body of generated methods, choose Tools | Templates.
         if( n < 2){
             return "NO";
         }
         for(int i=2; i<= Math.sqrt(n); i++){
             if( n % i == 0){
                 return "NO";
             }
         }
         return "YES";
    }
}
