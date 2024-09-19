package Leetcode;
import java.util.*;

        // https://leetcode.com/problems/create-target-array-in-the-given-order/description/

		// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
		// Output: [0,4,1,3,2]
		// Explanation:
		// nums       index     target
		// 0            0        [0]            number 0 is inserted in index 0
		// 1            1        [0,1] 			number 1 is inserted in index 1
		// 2            2        [0,1,2]		number 2 is inserted in index 2
		// 3            2        [0,1,3,2]		number 3 is inserted in index 2    //value 2 is at index 3
		// 4            1        [0,4,1,3,2]    number 4 is inserted in index 1    values are shifted to  +1 position

public class Create_Target_Array {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		// TODO Auto-generated method stub
		int[] ans=array(nums,index);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] array(int[] nums,int[] index)
	{
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		int ln=nums.length;
		int [] target=new int[ln];
		
		/* This loop iterates over each element in the nums array.
		arraylist.add(index[i], nums[i]) adds the value nums[i] at the position specified by index[i] in the arraylist.*/
		
		for(int i=0;i<ln;i++)
		{
			arraylist.add(index[i], nums[i]);
		}
		
		//This loop iterates over the arraylist and copies each element to the target array.
		for(int i=0;i<ln;i++)
		{
		 target[i]=arraylist.get(i);
		}
	return target;
     
	}
	
}

			//	Here’s how the code would work step-by-step:
			
			//	Initialize arraylist as an empty list and target as an array of size 5.
			//	Insert values into arraylist:
			//	arraylist.add(0, 1): arraylist = [1]
			//	arraylist.add(1, 2): arraylist = [1, 2]
			//	arraylist.add(2, 3): arraylist = [1, 2, 3]
			//	arraylist.add(2, 4): arraylist = [1, 2, 4, 3]
			//	arraylist.add(1, 5): arraylist = [1, 5, 2, 4, 3]
			//	Copy values from arraylist to target:
			//	target = [1, 5, 2, 4, 3]
			//	The final target array returned will be [1, 5, 2, 4, 3].
