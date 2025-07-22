package kodNest;

public class notstaticBlock {
//     First static block is executed
	static {
		 System.out.println("Static block is executing...");
	 }
	
//	after the object creation these two will be called
//	 3rd
	
	{
		System.out.println("Non-static block is executing");
	}
	
	
//	4th
	notstaticBlock(){
		System.out.println("Constructor is  called");
	}
	
	public static void main(String[] args) {
		
//		2nd  main executed
		
       System.out.println("main() is executing...");
       notstaticBlock b1 = new notstaticBlock();
//       notstaticBlock b2 = new notstaticBlock();
//       notstaticBlock b3 = new notstaticBlock();
	}

}
