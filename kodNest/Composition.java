package kodNest;

public class Composition {

	public static void main(String[] args) {
		Lapi l = new Lapi();
		l.brand = "Dell";
		l.price = "35000";
		l.accessData();

	}

}
class Lapi{
	String brand;
	String price;
	
	Data d =new Data();
	
	public void  accessData() {
        d.value = "ICC-Champions";
		System.out.println("Accessing data with laptop: " + d.value);
		System.out.println("Laptop brand: " + brand);
		System.out.println("Price: "  +price);
	}
}
class Data {
	String value;
}