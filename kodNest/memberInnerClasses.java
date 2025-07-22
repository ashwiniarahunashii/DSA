package kodNest;

public class memberInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr car1 = new Carr();
		car1.drive();
		
		Carr.Engine engine = car1.new Engine();
		engine.runCar();
		
		
 
	}

}

class Carr {
	private String brand;
	private int price;
	public void drive() {
		System.out.println("Drive the car");
	}
	
	class Engine {
		int hp;
		public void runCar() {
			//we can access outer class states
			hp = 750;
			brand = "Maruti";
			price = 75000;
			System.out.println("Car info: ");
			System.out.println(brand + " " + price + " " + hp);
			
			//we can access outer class methods inside another  class
			drive();
		}
	}
}