package com.leetcode.array;
/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

The array may contain duplicates.

Example 1:

Input: [1,3,5]
Output: 1
Example 2:

Input: [2,2,2,0,1]
Output: 0
Note:

This is a follow up problem to Find Minimum in Rotated Sorted Array.
Would allow duplicates affect the run-time complexity? How and why?
 */

// #[Trying]
public class FindMinimum_in_RotatedSortedArrayII {

    /*
   [1,2,3,4]
   [3,4,1,2]

   [3,3,4,4,1,1,2,2]

   mid,r:
   4,2
   1,2

   a[m] == a[r]
         m   r
   4,4,4,1,1,1
   1,1,1,2,2,2

   3,3,1,3
   3,3,3,1,3,3,3,3
     */
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                if (nums[mid] < nums[l]) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
        }
        return nums[l];
    }
}