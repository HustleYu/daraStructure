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
    //新增二分法查找
    public int searchInsert2(int[] nums, int target) {
        int l = nums.length;
        if (l == 0){
            return 0;
        }
        int left = 0,right = l-1,answer = l;
        while (left < right){
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]){
                answer = nums[mid];
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return answer;
    }
}
