package kodNest;

import java.util.*;
public class Arithmatic_Opn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter operation( +,-,*,/) you want to perform: ");
		String op=sc.next();
		switch(op) {
		case "+" : System.out.println("Addtion: " +(a+b));
					break;
		case "-" : System.out.println("Subtraction: " + (a-b));
					break;
		case "*" : System.out.println("Multiplication: " +(a*b));
					break;
		case "/" : System.out.println("Division: " + (a/b));
					break;
		case "0": System.out.println("Invalid input");
				   
		}

	}

}
