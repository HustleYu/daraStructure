package com.dataStructure.array;

public class class05 {
    //加1，主要区分是否全是9，非全9情况如何处理进位
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for(int i=l-1;i>=0;i--){
            if(digits[i] != 9){
                ++digits[i];
                for(int j=i+1;j<=l-1;j++){
                    digits[j] = 0;
                }
                return digits;
            }
        }
        int ans[] = new int[l+1];
        ans[0] = 1;
        return ans;
    }
}
