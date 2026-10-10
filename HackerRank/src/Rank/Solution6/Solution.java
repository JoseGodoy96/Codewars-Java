package Rank.Solution6;

import java.io.*;
import java.util.*;

public class Solution {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int b = sc.nextInt();
            if (b <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            int h = sc.nextInt();
            if (h <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            int total = b * h;
            System.out.println(total);
        } catch (Exception ex) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}