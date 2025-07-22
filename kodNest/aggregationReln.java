package kodNest;

public class aggregationReln {

	public static void main(String[] args) {
		Charger c = new Charger();
		c.type = "c-type";
		
		Laptop l = new Laptop();
		l.brand = "Lenovo";
		l.price = "35000";
		l.hasCharger(c);
		
		//Try to access charger without laptop
		l=null;
		l.hasCharger(c);    //This throw java.lang.NullPointerException  error
		
	}

}
class Laptop{
	String brand;
	String price;
	Charger c;
	public void hasCharger(Charger obj) {
		c = obj;
		System.out.println("Accessing charger with laptop: " + c.type);
		System.out.println("Laptop brand: " + brand);
		System.out.println("Price: "  +price);
	}
}
class Charger {
	String type;
}