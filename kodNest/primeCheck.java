package kodNest;

import java.util.Scanner;

public class primeCheck {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
//		        int number = scanner.nextInt();
		        
		        int start =20;
		        int end=30;
		       for(int number=start;number<=30;number++){
		        if (isPrime(number)) {
		            System.out.println(number);
		        } else {
		            System.out.println(number);
		        }
		       }
		        //scanner.close();
		    }
	

		    // Function to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) return false; // Numbers <= 1 are not prime
		        if (n == 2 || n == 3) return true; // 2 and 3 are prime
		        if (n % 2 == 0) return false; // Even numbers > 2 are not prime

		        // Check divisibility from 3 to sqrt(n), skipping even numbers
		        for (int i = 3; i <= Math.sqrt(n); i += 2) {
		            if (n % i == 0) return false; // If divisible, not prime
		        }
		        return true; // Prime number
		    }
 

	}

