package kodNest;

import java.util.Scanner;

public class arraysOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40,80,14};
		System.out.println("Original array: ");
		traverse(arr);
		//System.out.println("Enter the elements of an array: ");
		
//		System.out.println("Enter the element to be inserted: " );
//		int ele = sc.nextInt();
//		System.out.println("Enter index: ");
//		int idx = sc.nextInt();
		
		int[] insert = insertArr(arr,50,4);
		System.out.println("After inserting: ");
		traverse(insert);
	}
	
	  // 1. Traversing an array
    public static void traverse(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
    // 2. Inserting into the array
	public static int[] insertArr(int[] arr,int ele,int idx) {
		if(idx < 0 || idx > arr.length) {
			 System.out.println("Invalid index");
			 return arr;
		}
		int[] newArr = new int[arr.length+1];
		for(int i=0,j=0;i<newArr.length;i++) {
			if(i==idx) {
				newArr[i] =ele;
			} else {
				newArr[i] =arr[j++];
			}
		}
		return newArr;
	}
}

