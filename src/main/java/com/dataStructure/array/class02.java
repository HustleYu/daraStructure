package com.dataStructure.array;

public class class02 {
        //删除有序数组中的重复项
        public int removeDuplicates(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int nodeFast = 1,nodeSlow = 1;
            while( nodeFast < nums.length){
                if(nums[nodeFast] != nums[nodeFast-1]){
                    nums[nodeSlow] = nums[nodeFast];
                    ++nodeSlow;
                }
                ++nodeFast;
            }
            return nodeSlow;
        }
}
