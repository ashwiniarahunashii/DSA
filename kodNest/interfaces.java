package kodNest;

public class interfaces {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		Mycalci cal1 = new Mycalci();
		cal1.add(a, b);
		cal1.sub(a, b);
		cal1.mul(a, b);
		cal1.div(a, b);
		
//		or
		
//		Calci cal2 = new Mycalci();
//		cal2.mul(a, b);
//		cal2.div(a, b);
		
//        or
//		 Calculator cal11= new Mycalci();  ///creating reference
//		    cal11.add(a, b);
//			cal11.sub(a, b);
			
			//for these we need to do down casting
//			((Calci) cal1).mul(a, b);
//			((Calci) cal1).div(a, b);
	}

}
interface Calculator{
	public abstract void add(int a,int  b);
	public abstract void sub(int a,int b);
}

interface Calci{
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}

class Mycalci implements Calculator,Calci{
	public void add(int a,int b) {
		System.out.println("sum : " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Difference : " + (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("Multiplication : " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("Division : " + (a/b));
	}
	
}