package kodNest;

public class areaOfCircle {

	public static void main(String[] args) {
		AreaCircle circle = new AreaCircle();
		circle.radius =  2.3;
		circle.area();

	}

}
class AreaCircle{
	double radius;
	final double pi =(double) 3.142;
	public void area() {
		System.out.println("Area of a circle is: " +(pi *radius*radius));
		
	}
}