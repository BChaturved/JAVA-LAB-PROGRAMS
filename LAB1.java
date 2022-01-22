import java.util.*;
class Invoice{

	private String number;
	private	String description;
	private int quantity;
	private double price;
	
	void assignNum(String number) {
		this.number=number;
	}
	
	void assigndes(String description) {
		this.description=description;
		}
	
	void assignqua(int quantity) {
		if(quantity>=0)
			this.quantity=quantity;
		else
			this.quantity=0;
		}
	
	void assignpri(double pri) {
		if(price>=0)
			this.price=pri;
		else
			this.price=0.0;
		}
	
	String getnumber() {
		return number;
	}
	
	String getdescription() {
		return description;
	}
	
	int getquantity() {
		return quantity;
	}
	
	double getprice() {
		return price;
	}
	
	double getInvoiceAmount() {
	    return (getprice()*getquantity());
	}
}
public class LabProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Invoice v1=new Invoice();
		
		System.out.println("Enter the invoice number;");
		String invoi=sc.next();
		sc.nextLine();
		System.out.println("Enter the description:");
		String des=sc.nextLine();
		System.out.println("Enter the quantity:");
		int quan=sc.nextInt();
		System.out.println("Enter the price per item:");
		double price=sc.nextDouble();
		v1.assignNum(invoi);
		v1.assigndes(des);
		v1.assignqua(quan);
		v1.assignpri(price);
        System.out.println("The invoice amount:"+v1.getInvoiceAmount());
        sc.close();
	}

}
