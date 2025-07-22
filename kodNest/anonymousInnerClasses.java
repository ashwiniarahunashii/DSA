package kodNest;

public class anonymousInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Greeter g = new Greeter() {
        	public void greet() {
        		System.out.println("Good Evening....");
        	}
        };
        g.greet();
	}

}
//interface Greeter {
//	void greet();
//}

abstract class Greeter {
	public abstract void greet();
}