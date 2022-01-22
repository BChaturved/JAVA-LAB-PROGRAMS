public class AdditionalPrograms1 {
public static void main (String args[]) {
//String Length
char chars[]= {'c','s','e'};
String s=new String(chars);
//System.out.println(s.length());

//String Literals
char chars1[]= {'j','a','v','a'};
String s1=new String(chars1);
System.out.println(s1);

//String concatenation
String line="Welcome "+"to "+"string "
+"functions";
System.out.println(line);

String a="Strength "+ 6+ 4;
System.out.println(a);
String b="Strength "+ (6+ 4);
System.out.println(b);

//Character Extraction
char x;
x="Mohan kalyan".charAt(9);
System.out.println(x);

//getChars()
String q="string functions in java";
int start=7;
int end=9;
char buf[]=new char[end-start];
q.getChars(start,end,buf,0);
System.out.println(buf);

//get bytes
byte k[]=q.getBytes();
for(int i=0;i<k.length;i++)
System.out.println(k[i]);
//tochar array
char c[]=q.toCharArray();
System.out.println(c);

//equals() and equalsIgnoreclass()
String o="java lab";
System.out.println(o.equals("JAVA LAB"));
System.out.println(o.equalsIgnoreCase("JAVA LAB"));

//region matches
System.out.println("matches?"+q.regionMatches(0, o, 0, 3));
//starts with and ends with
System.out.println("starts with java?"+o.startsWith("java"));
System.out.println("endswith java?"+q.endsWith("java"));
//index position
System.out.println("index of j in java lab"+o.indexOf('j'));
System.out.println("last occurence of a in java lab"+o.lastIndexOf('a'));
//replace
System.out.println("Replacing h with k in hello:"+"hello".replace('h','k'));
//upper and lower case
System.out.println("converting 'gmk' to uppercase:"+"gmk".toUpperCase());
System.out.println("converting 'RAMU' to lower case:"+"RAMU".toLowerCase());
//additional string methods
System.out.println("the unicode value of u in 'suresh'is:"+"suresh".codePointAt(1));
System.out.println("'java lab' contains la?:"+"java lab".contains("la"));
System.out.println(String.format("it isa string format method done by %s","kalyan"));
System.out.println("'hello' content equals'Hello'?:"+"hello".contentEquals("Hello"));
}
}
