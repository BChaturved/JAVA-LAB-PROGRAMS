import java.util.Scanner;
class Book{
	private String book_name;
	private long ISBN_Number;
	private String author_name;
	private String publisher;
	
	 String getBook_name() {
		return book_name;
	}
	void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	long getISBN_Number() {
		return ISBN_Number;
	}
	void setISBN_Number(long ISBN_Number) {
		this.ISBN_Number = ISBN_Number;
	}
	String getAuthor_name() {
		return author_name;
	}
	void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void description() {
		System.out.println("The description:\n"+"BookName:"+getBook_name()+"\nISBN number:"+getISBN_Number()+"\nAuthor name:"+getAuthor_name()+"\n"
				+ "Publisher:"+getPublisher());
	}
}
public class Labprogram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b[]=new Book[30];
		Scanner sc=new Scanner(System.in);
		int n,i,isbn;
		String author,publisher,name;
		System.out.println("Enter the number of books:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			b[i]=new Book();
			System.out.println("Book Details-"+(i+1));
			if(i==0)
			sc.nextLine();
			System.out.println("Enter the name of book:");
			name=sc.nextLine();
			b[i].setBook_name(name);
			System.out.println("Enter the ISBN of book:");
			isbn=sc.nextInt();
			b[i].setISBN_Number(isbn);
			sc.nextLine();
			System.out.println("Enter the name of author:");
			author=sc.nextLine();
			b[i].setAuthor_name(author);
			
			System.out.println("Enter the publisher:");
			publisher=sc.nextLine();
			b[i].setPublisher(publisher);
			}
		for(i=0;i<n;i++) {
			System.out.println("Book-"+(i+1));
			b[i].description();
		}
		sc.close();

	}

}
