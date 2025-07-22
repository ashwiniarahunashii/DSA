package kodNest;

//About method area:
//  The class loader in the jvm has this method area where all the tatics, methods are loaded------>
//  1] First jvm will load all the static components inside method area.
//  2] it will load static variables and assign the values given by user if not it will take default value
//  3] Then it execute all the static blocks. If all stattic blocks are executed go to the main method.



public class staticblock {
	static int a=10;
	static int b=0;
	
	static {
		System.out.println("Static block1 is executing");
		b=20;
		System.out.println(b);
		//static String name ="Ash";
	}
	static {
		System.out.println("Static block2 is executing");
		System.out.println(a);
	}
	static {
		System.out.println("Static block3 is executing");
	}
 public static void fun() {
	 System.out.println("Java is fun");
	 System.out.println("a = " +a);
	 System.out.println("b = " +b);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()is executing " +a+ " times");
		fun();
	}

}
