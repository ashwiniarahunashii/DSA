package kodNest;
import java.util.*;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int num=sc.nextInt();
		int rem=0,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
      System.out.println(sum);
	}

}
