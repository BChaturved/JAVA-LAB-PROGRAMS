import java.util.*;
import java.io.*;
public class LabProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("An arithematic exception may be raised");
			int a=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException raised:"+e);
		}
		while(true) {
		try{
			System.out.println("An inputmismatch exception may be raised");
			int n;
			System.out.print("Enter the n value (integer):");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			System.out.printf("The entered value:%d",n);
			System.exit(0);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input mismatch please re-enter the value:"+e);
		}
		}
	}

}
