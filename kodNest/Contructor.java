package kodNest;

public class Contructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			new Child();
		}
      
	}
}

class Parent {
	Parent() {
		System.out.println("0-parameteerized parent construcor");
	}
	Parent(int a) {
		System.out.println("1- para parent constructor");
	}
}

class Child extends Parent{
	Child() {
		this(10);
		System.out.println("0-parameteerized child construcor");
	}
	Child(int i) {
		super(10);
		System.out.println("1-parameteerized child construcor");
	}
}