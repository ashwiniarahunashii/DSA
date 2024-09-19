package Leetcode;

import java.util.Arrays;


//      https://leetcode.com/problems/concatenation-of-array/description/

//		Input: nums = [1,2,1]
//		Output: [1,2,1,1,2,1]
//		Explanation: The array ans is formed as follows:
//		- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//		- ans = [1,2,1,1,2,1]


public class Array_concat {
	public static void main(String[] args) {
		int[] nums= {1,3,2,1};
		System.out.println("Original array: " + Arrays.toString(nums));
		int[] res=getConcatenation(nums);
		System.out.println("After concatenation: "+ Arrays.toString(res));
	}
	
	    static int[] getConcatenation(int[] nums) {
	         int[] ans = new int[2*nums.length];
	         for(int i=0;i<nums.length;i++)
	         {
	            ans[i]=nums[i];
	            ans[i+nums.length]= nums[i];
	         }
	         return ans;
	    }
	}


