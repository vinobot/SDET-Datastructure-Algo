package strings;

import java.util.HashMap;

import org.junit.Test;

public class Anagram {
	
	@Test
	public void dataSet1() {
		String str1 = "anagram";
		String str2 = "nagaram";
		isAnagram(str1, str2);
	}
	@Test
	public void dataSet2() {
		String str1 = "anagram";
		String str2 = "agaram";
		isAnagram(str1, str2);
	}
	@Test
	public void dataSet3() {
		String str1 = "silent";
		String str2 = "listeq";
		isAnagram(str1, str2);
	}

	public void isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			throw new RuntimeException("String length not equals, can't be anagram");
		}
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (Character ch : str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (Character ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		if(map1.equals(map2)) {
			System.out.println("Given strings are anagram");
		}
		else  System.out.println("Given strings are not anagram");
	}
}
