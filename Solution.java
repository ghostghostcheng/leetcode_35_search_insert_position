package leetcode_35_search_insert_position;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int resultIdx = 0;
        
        if (nums.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return resultIdx;
            } else {
                break;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[0]) {
                resultIdx = 0;
                break;
            } else if (nums[nums.length - 1] < target) {
                resultIdx = nums.length;  
                break;
            } else if (nums[i] < target) {
                continue;
            } else {
                resultIdx = i;
                break;
            }
        }
        
        return resultIdx;
    }
}