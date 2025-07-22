package kodNest;
import java.util.*;
import java.util.Arrays; 
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int minIdx;
		int[] arr = {3,7,1,9,5,2};
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
		for(int i =0;i<arr.length-1;i++) {
			minIdx = i;
			for(int  j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		System.out.println(Arrays.toString(arr));


	}

}
