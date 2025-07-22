package kodNest;
import java.util.*;

public class StackUsingArray {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] stack = new int[n];
	int top = -1;
	 
	
	public void push(int value) {
		if(top < (n-1)) {
			 top++;
			 stack[top] = value;	
		} else {
			System.out.println("Stack is full ");
		}
	}
	public int pop() {
		if(top >=0) {
			int ele = stack[top];
			top--;
			return ele;
		} else {
			System.out.println("Cannot pop, stack is empty!");
		}
		return 0;
	}
	public void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack elements are: ");
			for(int i=0;i< n;i++) {
				System.out.print(stack[i]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of stack: ");
		StackUsingArray stack = new StackUsingArray();
		Scanner sc = new Scanner(System.in);
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.display();
		
		
	while(true) {
		System.out.println("Enter \n 1 - push \n 2 -  pop \n 3 - print \n 4 - exit");
		int op = sc.nextInt();
	
		switch(op) {
		case 1 : System.out.println("Enter value to  push --> ");
		         int ele= sc.nextInt();
		         stack.push(ele);
		         break;
		case 2: stack.pop();
		        break;
		case 3: stack.display();
		        break;
		case 4: System.out.println("Exiting...");
		        break;
		}
		
	 }
	}

}
