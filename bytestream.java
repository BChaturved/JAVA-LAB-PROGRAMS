import java.io.*;
public class ByteStreamTrail {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Hello";
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		int x;
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
	/*	while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
			System.out.println(bis.available());
		}*/
		FileOutputStream f1=new FileOutputStream("file1.txt");
		while((x=bis.read())!=-1)
		{
			f1.write((char)x);
		}
	}

}
