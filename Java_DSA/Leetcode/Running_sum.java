package Leetcode;
import java.util.Arrays;


// https://leetcode.com/problems/running-sum-of-1d-array/

//	Input: nums = [1,2,3,4]
//	Output: [1,3,6,10]
//	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


public class Running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums= {1,2,3,4};
       System.out.println("Original array: " +Arrays.toString(nums));
       int[] res=runningSum(nums);
       System.out.println("After sunning sum: " +Arrays.toString(res));     
	}
	
	static  int[] runningSum(int[] nums) {
        //int[] runningSum=new int[nums.length];
        for(int i=1;i< nums.length;i++){           
             nums[i] += nums[i-1];                          //num[1]=num[1]+num[0]=2+1=3
        }                                                   //num[2]=num[2]+num[1]=3+3=6
        return nums;
    }

}
