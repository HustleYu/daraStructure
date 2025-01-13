package com.dataStructure.array;

public class class03 {
    //移除元素
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int n = 0,i=0;
        while(i<nums.length){
            if(nums[i] != val){
                nums[n] = nums[i];
                n++;
            }
            i++;
        }
        return n;
    }
}
