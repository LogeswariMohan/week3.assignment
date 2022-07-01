package week3.assignmentss;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		
		Integer[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		 Map<Integer,Integer> map = new TreeMap<>();
		 for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		//map.put(ipo index value ula varum,(andha index ku vara value ula inga get pannum,defualt ah 0 erukum...)
			//+1->edhukuna suppose iterate agurapo again same element vandhuchuna onnu add agum like counter)	
		}
			
		System.out.println(map);	 
			
	}		 

}
