package Leetcode;
import java.util.*;

        //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

		//Input: nums = [8,1,2,2,3]
		//Output: [4,0,1,1,3]
		//Explanation: 
		//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
		//For nums[1]=1 does not exist any smaller number than it.
		//For nums[2]=2 there exist one smaller number than it (1). 
		//For nums[3]=2 there exist one smaller number than it (1). 
		//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

 
public class Smaller_then_current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public int[] smallerNumbersThanCurrent(int[] nums) {
		        int[] cp = Arrays.copyOf(nums, nums.length);
		        Arrays.sort(cp);
		        int len = nums.length;
		        int res[] = new int[len];
		        for (int i = 0; i < len; i++) {
		            int last = len - 1;
		            int cnt = 0;
		            while (last >= 0) {
		                if (cp[last] < nums[i]) {
		                    cnt = last + 1;
		                    res[i] = cnt;
		                    break;
		                }
		                last--;
		            }
		        }
		        return res;
		    }

		}
         
	}

}
