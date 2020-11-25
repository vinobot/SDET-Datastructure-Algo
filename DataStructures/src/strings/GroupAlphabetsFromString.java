package strings;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GroupAlphabetsFromString {

	@Test
	public void dataSet1() {
		String input = "BdAcbCaD";
//		groupAlphabetsIncludesCase(input);
		groupAlphabetsUsingPointer(input);
	}
	@Test
	public void dataSet2() {
		String input = "BdAcbCaDdB";
//		groupAlphabetsIncludesCase(input);
	}
	//Approach-1 Brute force
	public void groupAlphabetsIncludesCase(String str) {
		String output ="";
		List<Character> ls = new ArrayList<>();
		char[] charArray = str.toLowerCase().toCharArray();
		char[] tempArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(!ls.contains(charArray[i])) {
			ls.add(tempArray[i]);
			for(int j= i+1; j<charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					ls.add(tempArray[j]);
				}
			}
			}
		}
		for (Character c : ls) {output +=c;}
		System.out.println(output);
	}
	
	//Approach-2 Using 2-pointer inprogress
	public void groupAlphabetsUsingPointer(String str) {
		String output ="";
		List<Character> ls = new ArrayList<>();
		char[] charArray = str.toLowerCase().toCharArray();
		char[] tempArray = str.toCharArray();
		int i=0,j=1;
		while(i<=str.length() && j<=str.length()) {
			if(!ls.contains(charArray[i])) {
				ls.add(tempArray[i]);
			if (charArray[i] == charArray[j]) {
				ls.add(tempArray[j]);
				j++;
			}
			else j++;
			}
		}
		System.out.println(ls);
	}
}
