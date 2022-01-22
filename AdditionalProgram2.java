public class AdditionalProgram2 {
public static void main (String args [])
{
StringBuffer s = new StringBuffer ("Hello");
StringBuffer p = new StringBuffer ();
System.out.println (s);
// length and capacity
System.out.println ("length of the string 'hello':" + s.length ());
System.out.println ("capacity of the string 'hello':" + s.capacity ());
System.out.println ("capacity of a an empty string:" + p.capacity ());
// ensure capacity and set length
p.ensureCapacity (100);
System.out.println ("capicity:" + p.capacity ());
s.setLength (3);
System.out.println (s);


s.setCharAt (1, 'g');
System.out.println ("replacing a character 'e' with 'g' in 'Hello'" + s);
// append
StringBuffer k = new StringBuffer ("Java");
System.out.println ("appending 'record' to 'Java':" + k.append ("record"));
// insert
System.out.println ("inserting 'lab' in between 'java record':" + k.insert (4, "lab"));
// reverse
StringBuffer g = new StringBuffer ("Hello");
System.out.println ("reverse order of 'Hello':" + g.reverse ());
// delete
System.out.println ("deleting a character:" + g.deleteCharAt (1));
// replace
StringBuffer z = new StringBuffer ("");


System.out.println ("index position:" + z.indexOf ("i"));
System.out.println ("lasrty index position:" + z.lastIndexOf ("i"));
StringBuffer q = new StringBuffer ("hello");
System.out.println ("before trimming");
System.out.println ("capacity is:" + q.capacity ());
q.trimToSize ();
System.out.println ("after trimming");
System.out.println ("capacity is:" + q.capacity ());


}
}
