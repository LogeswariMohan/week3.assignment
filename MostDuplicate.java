package week3.assignmentss;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicate {

	public static void main(String[] args) {
		
		String  input = "abbaba";
		int count = 0; 
		char s = input.charAt(0);
		Map<Character,Integer> map = new HashMap<>();
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			//reference
			//map.put(null, null) 
			//map.getOrDefault(charArray, null) 
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
			if(map.get(charArray[i])>count) {
				s = charArray[i];
				count = map.get(charArray[i]);
			}
		}
		System.out.println(s+"="+count);
		//System.out.println(s);//which character u sollum
		//System.out.println(count);//ethana times repeated nu count matum sollum	}

}
}
