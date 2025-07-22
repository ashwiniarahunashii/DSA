package kodNest;

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	   Vehicle v = new Vehicle();    //Cannot instantiate the type  ,we cannot create objects of abstract classes
		
//		Vehicle v = new Car();        //Upcasting
//		v.Engine();
//		v.Wheel(10);
		
		
       Car car =new Car();
       car.Engine();
       car.Wheel();
       car.Wheel(4);
       
       System.out.println();
       Bike b = new Bike();
       b.Engine();
       b.Wheel(2);
	}

}

//<----------------------------------THIS IS EXAMPLE OF ABSTRACT CLASSES---------------------------------------------->

abstract class Vehicle {
	static int wheel = 10;
	public abstract void Engine();            //Abstract methods does not have body
	public void Wheel(int wheel) {
		System.out.println("Vehicle has "+ wheel+ " wheels");
	}
	public void Wheel() {
		System.out.println("Vehicle has "+ wheel+ " wheels");
	}
}

abstract class Animal{
	
}

//   WE CANNOT EXTEND MORE THEN 2 ABSTRACT CLASSES

//class Car extends Vehicle,Animal {
//
//	
//}

class Car extends Vehicle {
	static String name= "Maruti";
	public void Engine() {
		System.out.println( name + " has its own engine");
	}
}

class Bike extends Vehicle {

	@Override
//	YOU MUST IMPLEMENT ALL THE ABSTRACT METHOD IN CLASS IF YOU ARE INHERITING FROM THAT CLASS
	public void Engine() {
	   System.out.println("Bike has its own engine type");
		
	}
}

