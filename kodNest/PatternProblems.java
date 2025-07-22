package kodNest;

public class PatternProblems {

	public static void main(String[] args) {
       //pattern3(5);
         pattern16(8);
	}
//    
//	*****
//	****
//	***
//	**
//	*

	static void pattern1(int n) {
		//step1 :rows
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
//			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	     *
//      **
//     ***
//    ****
//   *****
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	    *
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	static void pattern3(int n) {
	   for(int i=1;i<=2*n;i++) {
		 int totalColsInRow= i>n? 2*n-i:i;
		for(int j=1;j<=totalColsInRow;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	  }
   }
	
//	     *
//      * *
//     * * *
//    * * * *
//   * * * * *
	
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	  ****
//    *  *
//    *  *
//    *  *
//    ****
	static void pattern5(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1|| i==n||j==1||j==n)
				   System.out.print("*");
			    else
			    	System.out.print(" ");	   
			}
			System.out.println();
		}
	}
	
//	*
//	**
//	* *
//	*  *
//	*   *
//	*    *
//	*     *
//	*      *
//	*       *
//	**********
	
	static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1|| i==n||j==1||j==i)
					   System.out.print("*");
				else
				     System.out.print(" ");	 
			}
			System.out.println();
		}
	}
	
	static void pattern13(int n){
		for(int i=1;i<=5;i++){
	           for(int j=1;j<=(5-i);j++){
	             System.out.print(" ");
	            }
	           for(int k=1;k<=i;k++){
	               if(i==1||i==5||k==1||k==i){ 
	                  System.out.print("* "); 
	                }else{ 
	                    System.out.print("  ");
	                }
	          }
	          System.out.println();
	        }
	}
	
	static void pattern14(int n) {
		for(int i=1;i<=2*n;i++) {
			int totalColsInRows = i>n ? 2*n -i -1:i;
			int numberOfSpaces= i>n?i-n : n-i;
			for(int k=1;k<=numberOfSpaces;k++){
	             System.out.print(" ");
	            }
			
			for(int j=1;j<=totalColsInRows;j++) {
				if(i==1||i==2*n-1 ||j==1 ||j==totalColsInRows) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	static void pattern15(int n) {
		        char ch = 'A';

		        for (int i = 0; i <n; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(ch);
		            }
		            ch++;
		            System.out.println();
		        }
//                char ch1='C';
		        for (int i = n; i>=0; i--) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(ch);
		            }
		            ch--;
		            System.out.println();
		        }
       }
	
	   static void pattern16(int n) {
	       for(int i=n;i>=1;i--) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}

	       for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			} 
	    }
}
