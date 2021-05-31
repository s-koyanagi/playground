package com.kysh.twosum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        // write your code here
        Integer[] nums = {6,5,4,3,2};
        Integer target = 5;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(Integer[] nums, Integer target) {
        int firstValueIndex = 0;
        int secondValueIndex = 0;
        for (int num: nums) {
            int searchTarget = target - num;
            if (searchTarget > 0 && Arrays.asList(nums).contains(searchTarget)){
                secondValueIndex = Arrays.asList(nums).indexOf(searchTarget);
                break;
            }
            firstValueIndex ++;
        }
        return new int[]{firstValueIndex,secondValueIndex};
    }

}
