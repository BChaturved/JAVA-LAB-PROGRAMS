import java.io.*;
public class CharReadAndWriteStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Harsha";
		char c[]=new char[s.length()];
		c=s.toCharArray();
		CharArrayReader c1=new CharArrayReader(c);
		int c2;
		//while((c2=c1.read())!=-1)
			//System.out.print((char)c2);
		CharArrayWriter c3=new CharArrayWriter();
		c3.write(c);
		FileWriter f1=new FileWriter("File2.txt");
		c3.writeTo(f1);
		f1.close();
	}

}
