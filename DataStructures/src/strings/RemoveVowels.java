package strings;

import java.util.HashMap;

import org.junit.Test;

public class RemoveVowels {
	
	@Test
	public void dataSet1() {
		String str = "youwillwinthis";
		removeVowelsFromString(str);
	}
	@Test
	public void dataSet2() {
		String str = "aeiou";
		removeVowelsFromString(str);
	}
	@Test
	public void dataSet3() {
		String str = "abeioxu";
		removeVowelsFromString(str);
	}
	
	public void removeVowelsFromString(String str) {
		String output = "";
		for (Character ch : str.toLowerCase().toCharArray()) {
			if(ch !='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u') {
				output += ch;
			}
		}
		System.out.println(output);
	}
	
}
