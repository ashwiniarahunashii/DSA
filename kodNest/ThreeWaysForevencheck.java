package kodNest;
import java.util.*;
public class ThreeWaysForevencheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		//The first way of checking for even odd is just divide it by 2
		// if(n%2==0){
		//   return true;
		// }
		
		//Second way is using bitwise and(&)
		//if the last bit of number is 0 it is even ,if it is 1 number is odd
//		
//	    if((n&1) == 0) {
//	    	System.out.println("Even");
//	    }else {
//	    	System.out.println("Odd");
//	    }
	    
	    //Third way is by using bitwise shift operation
	    
	    if(n == (n>>1)<<1) {
	    	System.out.println("Even");
	    }else {
	    	System.out.println("Odd");
	    }
	}

}
