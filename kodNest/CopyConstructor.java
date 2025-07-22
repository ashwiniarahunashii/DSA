package kodNest;

class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CODE REDUNDANCY IS THERE
		
//		Candidate c1 = new Candidate("Amit", "cse", 2024, 7.5, "Kodnest");
//		c1.display();
//		Candidate c2 = new Candidate("Sumit", "cse", 2024, 7.8, "Kodnest");
//		c2.display();
//		Candidate c3 = new Candidate("Arpit", "cse", 2024, 8.0, "Kodnest");
//         c3.display();
		
		
		Candidate sample = new Candidate("cse", 2024,"Kodnest");
		Candidate c1 = new Candidate(sample,"Sumit",8.08);
		
//		Candidate c1 = new Candidate(sample,"Sumit",8.08);
//		or
//		c1.name = "Sumit";
//		c1.cgpa=8.88;
		
		c1.display();
		
		Candidate c2 = new Candidate(sample,"Amit",9.8);
		c2.display();
		
	}

}

class Candidate {
	String name;
	String branch;
	int yop;
	double cgpa;
	String institute;
	
//	public Candidate(String name,String branch,int yop,double cgpa,String institute) {
//		this.name =name;
//		this.branch = branch;
//		this.yop = yop;
//		this.cgpa = cgpa;
//		this.institute = institute;
//	}
	
	
	public Candidate(String branch,int yop,String institute) {
		this.branch =branch;
		this.yop = yop;
		this.institute = institute;
	}
	
	//copy constructor
	public Candidate(Candidate c,String name,double cgpa) {
		// TODO Auto-generated constructor stub
		this.branch = c.branch;
		this.yop = c.yop;
		this.institute = c.institute;
		
		this.name = name;
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println("Name : " +name);
		System.out.println("Branch : " +branch);
		System.out.println("YOP : " +yop);
		System.out.println("CGPA : " +cgpa);
		System.out.println("Institute : " +institute);
		System.out.println(); 
	}
}
