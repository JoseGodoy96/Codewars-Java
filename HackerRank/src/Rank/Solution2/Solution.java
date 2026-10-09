package Rank.Solution2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N < 2 || N > 20) {
            return ;
        }
        for (int i = 1; i <= 10; i++) {
            int total = N * i;
            String format = String.format("%d x %d = %d", N, i, total);
            System.out.println(format);
        }
        bufferedReader.close();
    }
}
