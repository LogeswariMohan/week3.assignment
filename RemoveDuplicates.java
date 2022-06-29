package week3.assignmentss;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
	  
		String[] words = text.split(" ");
		int len = words.length;
			
			Set<String> removeset=new LinkedHashSet<String>();//we are taking Set, as it  does not allows duplicate
			for (String var : words) {
				removeset.add(var);
				
			}
			System.out.println(removeset);
			

}
}
