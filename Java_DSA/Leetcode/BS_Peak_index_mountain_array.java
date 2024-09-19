package Leetcode;

   //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
   
		//Input: arr = [0,1,0]
		//
		//Output: 1
		//
		//Example 2:
		//
		//Input: arr = [0,2,1,0]
		//
		//Output: 1
		//
		//Example 3:
		//
		//Input: arr = [0,10,5,2]
		//
		//Output: 1

public class BS_Peak_index_mountain_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {0,10,13,15,15,15,2};       //15 is peak element
        int ans=Solution(arr);
        System.out.print(ans);
        
	}
	static int  Solution(int[] arr) {
      int start=0;
      int end=arr.length - 1;
      while(start<end) {
    	  int mid=start + (end - start)/2;
    	  if(arr[mid] < arr[mid+1]) {
    		  start=mid+1;
    	  }else {
    		  end=mid;
    	  }
    	
      }
	return start;
	}

}
