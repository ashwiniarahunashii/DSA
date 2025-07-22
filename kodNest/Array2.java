package kodNest;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter array values: ");
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++) {
    	      arr[i] = sc.nextInt();
       }
        
        System.out.print("Array Elements are: ");
        for(int i=0;i<arr.length;i++) {
  	      System.out.print(arr[i] + " "); 
     }
       

	}

}
