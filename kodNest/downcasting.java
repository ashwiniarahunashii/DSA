package kodNest;

public class downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessRobo(new FighterRobot());      //accessRobo will take object of FighterRobo
		accessRobo(new DoctorRobot());
		accessRobo(new TeacherRobot());
        
	}
	public static void accessRobo(Robot r) {
		r.charge();
		r.talk();
		
//		accessRobo(new FighterRobot());          when this is called  r starts referencing to the object of fighterRobo class
		if(r instanceof FighterRobot) {         //Since r is only one reference var used  for 3 child classes we need to check whether it is instance of particular method or not
			((FighterRobot) (r)).fight();
		}
		
//		accessRobo(new DoctorRobot());          When this is called r starts referring to the object of the DoctorRobo class 
		if(r instanceof DoctorRobot) {
			((DoctorRobot) (r)).check();
		}
		
//		accessRobo(new TeacherRobot());         When this is called r starts  referring to the object of the DoctorRobo class 
		if(r instanceof TeacherRobot) {
			((TeacherRobot) (r)).teach();
		}
		
	}

}
class Robot{
	public void charge() {
		System.out.println("Robo is charging");
	}
	public void talk() {
		System.out.println("Robo is talking");
	}
}

class FighterRobot extends Robot{
	public void talk() {    //inherited method
		System.out.println("Fighterrobo is talking about fight");
	}
	public void fight() {   //child specific
		System.out.println("Fighter robo is fighting");
	}
}

class DoctorRobot extends Robot{
	public void talk() {      //inherited method
		System.out.println("Doctorrobo is talking about illness");
	}
	public void check() {     //child specific
		System.out.println("Doctor robo is checking patient");
	}
}

class TeacherRobot extends Robot{
	public void talk() {        //inherited method
		System.out.println("Teacherrobo is teaching");
	}
	public void teach() {      //child specific
		System.out.println("Teacher robo is teaching");
	}
}