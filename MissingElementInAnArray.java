package week3.assignmentss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		 Integer[] arr = {1,2,3,4,7,6,8};
		 
		 List<Integer> miss = new ArrayList<>();
		 
		 for (int i = 0; i < arr.length; i++)//edhu list kula add panna indha for loop
		 {
			 miss.add(i);
		}
		 Collections.sort(miss);//like Arrays.sort(); ascending order
		 
		 for (int i = 1; i <arr.length; i++)//edhu condition potu answer find panna 
			{
				if(i!=arr[i-1])
				{
				System.out.println(i);

	}

}
		 }
}
