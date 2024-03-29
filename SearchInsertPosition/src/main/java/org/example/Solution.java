package org.example;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (nums[i] < target) {
            i++;
            if (i > nums.length - 1) {
                return nums.length;
            }
        }
        return i;
    }
    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
