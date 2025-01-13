package com.dataStructure.array;

public class class04 {
    //搜索插入位置
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        if(target == nums[l/2]){
            return l/2;
        }
        if(target < nums[l/2]){
            for(int i=0;i<l/2;i++){
                if(target == nums[i]){
                    return i;
                }else if(target < nums[i]){
                    return i;
                }
            }
            return l/2;
        }else{
            for(int i=l/2;i<l;i++){
                if(target == nums[i]){
                    return i;
                }else if(target < nums[i]){
                    return i;
                }
            }
            return l;
        }
    }
}
