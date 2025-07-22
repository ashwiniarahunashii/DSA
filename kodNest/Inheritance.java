package kodNest;

public class Inheritance {

	public static void main(String[] args) {
		Football ft = new Football();
		ft.exercise();
		ft.playMatch();
		
		Throwball tb =new Throwball();
		tb.exercise();
		tb.playMatch();

	}

}
class Player{
	public void exercise() {
		System.out.println("The player is doing exercise");
	}
	public void playMatch() {
		System.out.println("The player is playing");
	}
}

class Football extends Player{
	
}
class Throwball extends Player{
	
}