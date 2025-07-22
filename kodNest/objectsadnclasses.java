package kodNest;

public class objectsadnclasses {

	public static void main(String[] args) {
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		        Student st1 = new Student();
		        st1.name = "Raj";
		        st1.branch = "CSE";
		        st1.study();
		        st1.dance();
		    }
		}

		class Student{
		    //states (data types)
		    String name;
		    String branch;
		    int rollNo;
		    
		    public void study(){
		        System.out.println(name + " is studying hard");
		    }
		    public void dance(){
		        System.out.println(branch + " students dance well!");
           }
		}
