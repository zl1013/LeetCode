package com.zzl.leetcode.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @version 1.0
 * @author: zhaozl
 * @date: 2021-09-06 21:11
 *
 * https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现
 *
 *
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 **/

public class TwoNumSum {
    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        int[] nums = {3,3};
        int i = 6;
        int[] twoSum = twoNumSum.twoSum(nums, i);
        System.out.println("["+twoSum[0]+","+twoSum[1]+"]");
        int[] twoSum2 = twoNumSum.twoSum2(nums, i);
        System.out.println("["+twoSum2[0]+","+twoSum2[1]+"]");
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