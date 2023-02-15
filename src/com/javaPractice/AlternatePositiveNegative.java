package com.javaPractice;

import java.util.ArrayList;

//Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
//Input:  arr[] = {1, 2, 3, -4, -1, 4}
//Output: arr[] = {-4, 1, -1, 2, 3, 4}
public class AlternatePositiveNegative {
    static void arrangeInArr(int[] nums) {
        int even_idx = 0, odd_idx = 1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[even_idx] = nums[i];
                even_idx += 2;    //updating idx to put positive int in alternate places
            } else {
                ans[odd_idx] = nums[i];
                odd_idx += 2;
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        arrangeInArr(nums);
    }
}