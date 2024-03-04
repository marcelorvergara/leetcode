package net.mvergara.solutions;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Num, Index
        HashMap<Integer, Integer> completionHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int completion = target - nums[i];
            if (completionHashMap.containsKey(completion)) {
                return new int[]{completionHashMap.get(completion), i};
            }
            completionHashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
