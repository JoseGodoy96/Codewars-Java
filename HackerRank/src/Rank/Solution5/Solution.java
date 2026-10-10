package Rank.Solution5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(i + " " + line);
            i++;
        }
        sc.close();
    }
}