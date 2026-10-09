package Rank;

/* Java's System.out.printf function can be used to print formatted output.
* The purpose of this exercise is to test your understanding of formatting output using printf.
* To get you started, a portion of the solution is provided for you in the editor;
*  you must format and print the input to complete the solution.
* */

import java.util.Scanner;

public class Solution {

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            if (s1.length() > 15) {
                sc.close();
                return ;
            }
            int x=sc.nextInt();
            if (x < 0 || x > 999) {
                sc.close();
                return ;
            }
            String format = String.format("%-14s %03d", s1, x);
            System.out.println(format);
        }
        sc.close();
        System.out.println("================================");
    }
}