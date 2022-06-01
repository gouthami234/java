package day8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;


public class Test1 {
	public static void main(String[] args) {
		
		// array list
		ArrayList al = new ArrayList();
		al.add("gouthami");
		al.add(12.04);
		al.add('c'); 
		System.out.println(al);
		
		 
		
		HashSet hs = new HashSet();
		hs.add("Srija");
		hs.add('h');
		// methods in hashset
		hs.add(15);
		hs.remove('h');
		System.out.println(hs.size());
		List l1 = new LinkedList();
		List l2 = new Vector();
		
		
		// fetching elment from ArrayList //
		System.out.println(al.get(0));
		hs.add(12);
		System.out.println(hs);
		
		//linked list
		l2.add("dinga");
		l2.add(30);
		l2.add(false);
		
		// vector
		l1.add('a');
		l1.add(0);
		System.out.println(l1);
		System.out.println(l2);
		
		l2.set(0,90);
		
		System.out.println(l2);
		
		// Priority queue 
		PriorityQueue pq = new PriorityQueue();
		pq.add(20);
		pq.add(57);
		pq.add(60);
		pq.add(12);
		pq.add(20);
		System.out.println(pq);
		
		//method in prirority queue
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		//LinkedHash Set 
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("devasean");
		lhs.add("BAhubali");
		lhs.add("kattappa"); 
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		
		//tree set
		TreeSet ts = new TreeSet();
		ts.add(30);
		ts.add(40);
		ts.add(60);
		System.out.println(ts);
		
		
		
		
		
	}

}
