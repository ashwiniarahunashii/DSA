package kodNest;

public class localClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fresher f = new Fresher();
        f.travel();
	}

}
 class Fresher {
	 public void travel() {
		 
		 //this is local class which is inside the travel method 
		 class Car {
			  String brand =  "wagon r";
			  public void drive() {
				  System.out.println("Drive to destination by " + brand + " car");
			  }
		 }
		 
		 Car c = new Car();
		 c.drive();
	 }
 }