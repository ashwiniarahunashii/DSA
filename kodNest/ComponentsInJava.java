package kodNest;

public class ComponentsInJava {
	 
	//Static variable
	static int a = 10;
	
	//Instance variable
	int b = 5;
	
	static {
		System.out.println("Static block is executing");
	}
	
	public static void fun1() {
		System.out.println("static fun1 is exeuting " + a + " times");
	}
	
	public void fun2() {
		System.out.println("non-static fun2() is executing..." + b + " times");
	}
	
	ComponentsInJava() {
		System.out.println("Constructor is executing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() is executing");
		ComponentsInJava c1 = new ComponentsInJava();
       c1.fun1();
       c1.fun2();
	}

}
