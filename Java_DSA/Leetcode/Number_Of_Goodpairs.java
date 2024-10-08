package Leetcode;

 //https://leetcode.com/problems/number-of-good-pairs/description/

//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

public class Number_Of_Goodpairs {
	public static void main(String[] args) {
		int[] nums= {1,2,3,1,1,3 };
		System.out.println(goodpairs(nums));
	}
	
    static int goodpairs(int[] nums) {
    	int count=0;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i]==nums[j]) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
}
