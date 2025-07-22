package kodNest;

public class Polymorphism {

	public static void main(String[] args) {
		Robo r;
		r = new TeacherRobo();
		r.charge();         //These 3 lines create redundancy in program
		r.talk();
		r.move();
		
		r = new FighterRobo();
		r.charge();         //These 3 lines create redundancy in program
		r.talk();
		r.move();
		
		r = new DoctorRobo();
		r.charge();          //These 3 lines create redundancy in program
		r.talk();
		r.move();
	
		System.out.println("-----------OR----------");
	
		TeacherRobo tr = new TeacherRobo();
		accessRobo(tr);
		FighterRobo fr = new FighterRobo();
		accessRobo(fr);
		DoctorRobo dr = new DoctorRobo();
		accessRobo(dr);
		
		System.out.println("-----------OR-----------");
		
		accessRobo(new TeacherRobo());
		accessRobo(new FighterRobo());
		accessRobo(new DoctorRobo());
	}
	
	
	public static void accessRobo(Robo r) {
		r.charge();
		r.talk();
		r.move();
	}
}

class Robo {
	void charge() {
		System.out.println("Robot is charging");
	}
	void talk() {
		System.out.println("Robo is talking");
	}
	void move() {
		System.out.println("Robo can move..");
	}
}
class TeacherRobo extends Robo{
	
}
class FighterRobo extends Robo{
	
}
class DoctorRobo extends Robo{
	
}
