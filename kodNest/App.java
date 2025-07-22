package kodNest;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         NewCar.MusicSystem music = new NewCar.MusicSystem();
         music.play();
         
	}

}

class NewCar {
	String brand = "maruthi";
	static int wheels = 4;
	
	static class MusicSystem {
		public void play() {
			System.out.println("Play music...");
			System.out.println("Wheels: " + wheels);
		}
	}
}
