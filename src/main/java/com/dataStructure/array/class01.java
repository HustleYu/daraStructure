package com.dataStructure.array;

public class class01 {

    //两数之和,时间复杂度O(N²)，空间复杂度O(1)
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
