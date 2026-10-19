package Rank.Solution14;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int v : count.values()) {
            if (v != 0)
                return false;
        }
        return true;
    }
}
