package day8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test2 {
	public static void main(String[] args) {
	ArrayList <String >al = new <String> ArrayList();
	al.add("gouthami");
	al.add("kavya");
	al.add("sumanika"); 
	System.out.println(al);
	// implementing iterator 
	Iterator itr = al.iterator();
	System.out.println(itr.next());
	System.out.println((itr.hasNext()));
	System.out.println(itr.next());
	
	// ListIterator
	ListIterator itr1 = al.listIterator();
	System.out.println(itr1.next());
	System.out.println(itr1.hasNext());
	System.out.println(itr1.next());
	System.out.println(itr1.hasNext());
	System.out.println(itr1.previous());
	System.out.println(itr1.hasPrevious());
	
	
	}
	
	

}
