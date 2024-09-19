package Leetcode;
import java.util.Arrays;

public class Built_arr_permutatiion {

	//https://leetcode.com/problems/build-array-from-permutation/
	
//		Input: nums = [0,2,1,5,3,4]
//		Output: [0,1,2,4,5,3]
//		Explanation: The array ans is built as follows: 
//		ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//				    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//				    = [0,1,2,4,5,3]
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums= {0,2,1,5,3,4};
		 int[] result=Solution(nums);
         System.out.println(Arrays.toString(result));
	}
	static int[] Solution(int[] nums)
	     {
	        int[] ans = new int[nums.length];
	        for(int i = 0; i < nums.length; i++) {
	            ans[i] = nums[nums[i]];
	        }
	        return ans;
	    }
	}


