import java.util.Scanner;
class Electricity{
	long counsumer_number;
	String consumer_name;
	long previous_reading;
	long current_reading;
	String eb_connection;
	Electricity(long no, String name, long pr, long cr,String eb){
		 counsumer_number=no;
		 consumer_name=name;
		 previous_reading=pr;
		 current_reading=cr;
		eb_connection=eb;
	}
	double rate() {
		double p=0.0;
		double c=current_reading-previous_reading;
		if(eb_connection.equals("domestic"))
		{
			if((c)<=100)
				 p= c*1;
			else
				if((c)<=200)
					p= 1*(100)+(c-100)*2.50;
			else
				if((c)<=500)
					p= 1*(100)+(100*2.50)+(c-200)*4;
			else
				p= (1*(100))+(100*2.50)+(300*4)+((c-500)*6);
					
		}
		else
		{
			if((c)<=100)
				p=100*2;
			else
				if((c)<=200)
					p= (100*2)+((c-100)*4.50);
			else
				if((c)<=500)
					p=(100*2)+(100*4.50)+((c-200)*6);
			else
				if((c)>501)
					p=(100*2)+(100*4.50)+(300*6)+((c-500)*7);
					
		}
		return p;
	}
}
public class LabProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer number:");
        long number=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Consumer name:");
        String name=sc.nextLine();
        System.out.println("Enter previous month reading:");
        long pr=sc.nextLong();
        System.out.println("Enter current month reading:");
        long cr=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter connection type:");
        String eb=sc.nextLine();
        Electricity e= new Electricity(number,name,pr,cr,eb);
        System.out.println("The bill amount to be paid:"+e.rate());
        sc.close();
	}

}
