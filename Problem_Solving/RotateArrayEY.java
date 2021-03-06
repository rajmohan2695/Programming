/*
Leetcode 189. Rotate Array (Easy)

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]

Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

package Problem_Solving;

import java.util.Arrays;

public class RotateArrayEY {
    public static void rotate(int[] nums, int k) {
//        k=k%(nums.length-1);
//        int l=nums.length-k;
//        for(int i=0;i<k;i++,l++){
//            int temp=nums[i];
//            nums[i]=nums[l];
//            nums[l]=temp;
//        }
        for(int i=0;i<k;i++){
            int temp = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int rotate = 3;
        rotate(nums,rotate);
        System.out.println(Arrays.toString(nums));
    }
}
