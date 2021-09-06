package com.zzl.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @version 1.0
 * @author: zhaozl
 * @date: 2021-09-06 21:11
 **/

public class TwoNumSum {
    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        int[] nums = {3,3};
        int i = 6;
        int[] twoSum = twoNumSum.twoSum(nums, i);
        System.out.println("["+twoSum[0]+","+twoSum[1]+"]");
        int[] twoSum2 = twoNumSum.twoSum2(nums, i);
        System.out.println("["+twoSum[0]+","+twoSum[1]+"]");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target-nums[i])){
                return new int[]{i,numMap.get(target - nums[i])};
            }
            numMap.put(nums[i],i);
        }
        return new int[2];
    }
}