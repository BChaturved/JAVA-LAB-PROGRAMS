import java.util.*;
public class AdditionalProgram3 {
	static int top=-1;
	static int n=100;
	static int stack[]=new int[100];
	static void push(int e) {
		if(isFull()) {
			System.out.println("Stack Overflow condition");
			return ;
		}
		stack[++top]=e;
	}
	static int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow condition");
			return -1;
		}
		return stack[top--];
	}
	static boolean isEmpty() {
		return (top==-1)?true:false;
	}
	static boolean isFull() {
		return (top==(n-1))?true:false;
	}
	static void viewStack() {
		int i;
		if(isEmpty()) {
			System.out.println("Stack underflow condition no elements to display");
			return ;
		}
		for(i=top;i>=0;i--)
			System.out.printf("%4d",stack[i]);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Stack Operations****");
		System.out.println("1.POP\n2.PUSH\n3.VIEWSTACK\n4.EXIT");
		while(true) {
		int choice;
		System.out.println("\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:int p;
			p=pop();
			if(p!=-1)
			System.out.println(p);
			break;
		case 2:int pus;
				System.out.println("Enter the elements you wanna push:");
				pus=sc.nextInt();
				push(pus);
				break;
		case 3: System.out.println("The elements in the stack are:");
				viewStack();
				break;
		default:
			System.exit(0);
		}
		
		}
	}
}
