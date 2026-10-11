package Rank.Solution7;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < -100 && n < 100) {
                sc.close();
            }
            String s = String.valueOf(n);
            System.out.println("Good job");
        } catch (Exception ex) {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
