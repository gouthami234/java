package lab7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetSquares {
	public static HashMap getSquares(int[] array) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		//using for each loop
		for(int n : array) {
			map.put(n, n*n);
		}
		return map;
	}
	public static void main(String[] args) {
		int array[] = new int[]{2,3,4,5,6,7,8,9};
		HashMap<Integer,Integer> map = getSquares(array);
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer Key = itr.next();
			System.out.println(Key+":"+ map.get(Key));
		}
	}

}
