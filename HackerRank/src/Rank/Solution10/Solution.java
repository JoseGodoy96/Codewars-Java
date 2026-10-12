package Rank.Solution10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 1 || n > 1073741824) {
            System.out.println(n + " is not a power of 2");
            System.out.println("An instance of class: Solution.Inner.Private has been created");
            return ;
        }
        for (int i = 0; i <= n; i++) {
            int total = (int)Math.pow(2, i);
            if (total == n) {
                System.out.println(n + " is power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
                return ;
            }
            if (total > n) {
                System.out.println(n + " is not a power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
                return ;
            }

        }
        System.out.println(n + " is not a power of 2");
        System.out.println("An instance of class: Solution.Inner.Private has been created");
    }
}
