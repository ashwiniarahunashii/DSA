package kodNest;

public class StaticandNonStatic {

	public static void main(String[] args) {
			
//		    static
			System.out.println("x = "+ StaticDemo.x);
			StaticDemo.fun1();
			//non static
			StaticDemo st =new StaticDemo();
			System.out.println("y = " + st.y);
			st.fun2();

	}

}
class StaticDemo {
	static int  x=10;
	public static void fun1() {
		System.out.println("Staic method executing");
	}
	
	int y=20;
	public void fun2() {
		System.out.println("non-static method is executing");
	}
}