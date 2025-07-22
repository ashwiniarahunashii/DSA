package kodNest;

public class inheritance4 {
   public static void main(String[] args) {
	   Cricketer c = new Cricketer();
	   System.out.println("Cicketer hobby: "+c.hobby);
	   c.play();
	   Footballer f = new Footballer();
	   System.out.println("Footballer hobby: "+f.hobby);
	   f.play();
   }
}

class Player1 {
	String hobby = "Sports";
	public void play() {
		System.out.println("Play sports!");
	}
}

class Cricketer extends Player1 {
	
}
class Footballer extends Player1 {
	
}