package leetcode_35_search_insert_position;

/*
	Given a sorted array and a target value, return the index if the target is found. 
	If not, return the index where it would be if it were inserted in order.
	
	You may assume no duplicates in the array.
	
	Here are few examples.
	[1,3,5,6], 5 �� 2
	[1,3,5,6], 2 �� 1
	[1,3,5,6], 7 �� 4
	[1,3,5,6], 0 �� 0
 */

public class Question {
	
	public static void main(String args[]) {
		int nums[] = {1, 3};
		int target = 2;
		
		int result = Solution.searchInsert(nums, target);
		
		System.out.print(result);
	}
}
