import java.io.*;
 class SD implements Serializable{
	int i;
	double d;
	boolean b;
	char c;
	SD(int i, double d, boolean b, char c) {
		super();
		this.i = i;
		this.d = d;
		this.b = b;
		this.c = c;
	}
	void display() {
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
}
public class SerialAndDeserial {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\SEMESTER\\2-1\\JaVA PRACTICE/File3.txt"));
		SD obj1=new SD(3,3.4,true,'b');
		SD obj2=new SD(6,3.4e+10,false,'a');
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:\\SEMESTER\\2-1\\JaVA PRACTICE/File3.txt"));
		SD s1=(SD)ois.readObject();
		s1.display();
		s1=(SD) ois.readObject();
		s1.display();
		ois.close();
	}
}
