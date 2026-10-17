package Rank.Solution14;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    class Solution {
        public boolean isAnagram(String s, String t) {
            Map<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
            for (char c : t.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) - 1);
            }
            for (int v : count.values()) {
                if (v != 0)
                    return false;
            }
            return true;

        }
    }
}
