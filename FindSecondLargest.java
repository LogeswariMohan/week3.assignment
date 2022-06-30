package week3.assignmentss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

	
				Integer[] data = {3,2,11,4,6,7,13,18};
				
				 //Arrange the array in ascending order
				List<Integer> l = new ArrayList<>();
				
				for (int i = 0; i < data.length; i++) {
					l.add(data[i]);
				}
				System.out.println(l);
				//tired for reference - first l create pnnitu aprm ll kula pota 
				// dha addAll method use panna mudiyum
				//List<Integer> ll = new ArrayList<>();
		          //   ll.addAll(l);
				Collections.sort(l);//Arrays.sort(); in array
				System.out.println(l.get(l.size()-2));
				

				
	}


}
