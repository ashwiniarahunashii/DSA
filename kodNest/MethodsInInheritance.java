package kodNest;

public class MethodsInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Accessing developer: ");
	    Developer d = new Developer();
	    d.goal();
	    d.code();
	    d.task();
	    System.out.println("Accessing tester: ");
	    Tester t = new Tester();
	    t.goal();
	    t.test();
	    t.task();
	}

}

class SoftwareEngineer {
	public void task() {
		System.out.println("Complete software on time");
	}
	public void goal() {
		System.out.println("Deal with  software");
	}
}

class Developer extends SoftwareEngineer {
	//This is Overridden method
	public void goal() {
		System.out.println("Deal with software development");
	}
	//this ,method is child specific method which is only present in the child class not in the parent
	public void code() {
		System.out.println("I will write code");
	}
}

class Tester extends SoftwareEngineer {
	public void goal() {
		System.out.println("Deal with testing");
	}
	public void test() {
		System.out.println("I will test software");
	}
}
