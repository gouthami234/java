package day8;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, 46233570);
		hm.put(2, "gouthami");
		hm.put(3, 00);
		hm.put(4, "shanker");
		System.out.println(hm);
		
		//serching
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("shanker"));
		
		// fetching 
		System.out.println(hm.get(3));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.remove(4));
		System.out.println(hm.size());
		
		
		
	}

}
