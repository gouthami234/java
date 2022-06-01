package lab7;

import java.util.HashMap;
import java.util.Set;

public class Student {
	public HashMap<String,String> getStudents(HashMap<String,Integer>student) {
		HashMap <String,String> medal = new HashMap<>();
		Set <String> set = student.keySet();
		for(String s : set)
		{
			 Integer marks = student.get(s);
             if(marks>=90)
             {
                   medal.put(s,"gold");
                  
             }
             else if(marks >=80)
             {
                   medal.put(s,"silver");
             }
             else if(marks>=70)
             {
                   medal.put(s,"Bronze");
             }
		}
		return medal;
		
	}
	 public static void main(String[] ar)
     {
            HashMap<String,Integer> s2 = new HashMap<>();
            Student  s1 = new Student();
            
            s2.put("Gouthami",96);
            s2.put("Srija",76);
            s2.put("Sumanika",89);
            s2.put("rupa",90);
            s2.put("vasmitha",93);
            System.out.println(s1.getStudents(s2));
     }
}


