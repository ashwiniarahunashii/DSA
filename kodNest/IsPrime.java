package kodNest;

import java.util.*;
public class IsPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println(num+ " is a Prime number");
			}else {
				System.out.println(num+" is not prime number");
			}
		}
	}

}
