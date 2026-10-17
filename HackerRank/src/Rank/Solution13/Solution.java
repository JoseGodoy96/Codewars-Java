package Rank.Solution13;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}
