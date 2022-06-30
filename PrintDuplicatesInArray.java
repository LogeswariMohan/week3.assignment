package week3.assignmentss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		Integer[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));//to add all in list
		Collections.sort(list);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer value : list) {
			if((list.indexOf(value))!=(list.lastIndexOf(value)))
			{
				set.add(value);
			}
		}	
		System.out.println(set);
}
}


