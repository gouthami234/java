package lab7;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap < String,String > h = new HashMap();
        h.put("gouthami","1234");
		h.put("srija","2345");
		h.put("rupa","3232");
		h.put("latha","5656");
		h.put("shanker","6767");
		h.put("lavakumar","6768");
		System.out.println(h.get("latha"));
	    System.out.println("Before Sorting");
	    
		Set<Map.Entry<String,String>> values = h.entrySet();
		for(Map.Entry <String,String> e : values) 
		  {
			System.out.println(e.getKey()+ ":"+e.getValue());
		  }
		
		// ascending order by using 
		TreeMap <String,String> sorted = new <String,String> TreeMap(h);
		Set<Entry<String,String>> m = sorted.entrySet();
		System.out.println("After sorting in ascending order keys");
        for(Map.Entry <String,String> e1 :m) {
        	
        	System.out.println(e1.getKey()+" : "+e1.getValue());
         }
        
        //descending order by using comparator and creating list //
        Comparator<Entry<String,String>> value1 = new Comparator<Entry<String,String>>() {
        	public int compare(Entry<String,String> e3,Entry<String,String> e4) {
        		String s1 = e3.getValue();
        		String s2 = e4.getValue();
        		return s1.compareTo(s2);
        	}
        
        // convert set to list
        List<Entry<String,String>> list = new <String,String> ArrayList(values);
        
        //sorting hashmap by values
        Collections.Sort(list,value1);
        
         
         LinkedHashMap<Entry<String,String>> sortedByValue = new LinkedHashMap<String,String>(list.size());
         for(Entry<String,String> e5:list) {
        	sortedByValue.put(e5.getValue() +":"+e5.getValue());
        	System.out.println("haspmap after sorting by value");
        	set<Entry<String,String>> entry = sortedByValue.entrySet();
        	for(Entry<String,String> e7 : entry)
        	{
        		System.out.println(e7.getValue()+":"+e7.getValue());
        	}
        }
       
        }
        
	


			
      

			
		
		
	
				
			
		
	

		
	

			
		
		
	   
	    	
	    

	


