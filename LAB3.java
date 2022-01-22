import java.util.*;
class SavingsAccount{
	 double annual_interest;
	private double savings_balance;
	double getSavings_balance() {
		return savings_balance;
	}
	void setSavings_balance(double d) {
		this.savings_balance = d;
	}
	 void modifyInterestRate(double s) {
		annual_interest=s/100.0;
		
	}
	 
	double calculateMonthlyInterest() {
	      double p= ((annual_interest*getSavings_balance())/12.0);
	      return p;
	}
	double savings_balance() {
		double d= getSavings_balance()+calculateMonthlyInterest();
		setSavings_balance(d);
		return d;
	}
	
}
public class LabProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.setSavings_balance(2000);
		saver2.setSavings_balance(3000);
		saver1.modifyInterestRate(4);
		saver2.modifyInterestRate(4);
		System.out.println("The monthly intersets of saver1:"+saver1.calculateMonthlyInterest());
		System.out.println("The monthly intersets of saver2:"+saver2.calculateMonthlyInterest());
		
		System.out.println("The balance saver1:"+saver1.savings_balance());
		System.out.println("The balance of saver2:"+saver2.savings_balance());
		saver1.modifyInterestRate(5);
		saver2.modifyInterestRate(5);
		System.out.println("The monthly intersets of saver1:"+saver1.calculateMonthlyInterest());
		System.out.println("The monthly intersets of saver2:"+saver2.calculateMonthlyInterest());
		
		System.out.println("The balance saver1:"+saver1.savings_balance());
		System.out.println("The balace of saver2:"+saver2.savings_balance());
		sc.close();
	}

}
