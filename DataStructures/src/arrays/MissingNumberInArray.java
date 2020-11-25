package arrays;

import java.util.Arrays;

import org.junit.Test;

public class MissingNumberInArray {

	@Test
	public void dataSet1() {
		int[] numbers = {4,3,2,7,8,2,3,1}; //1,2,2,3,3,4,7,8
//		getMissingNumberFromArray(numbers);
	}
	
	@Test
	public void dataSet2() {
		int[] numbers = {13,11,2,5,6,7,9,10,3,1}; 
//		getMissingNumberFromArray(numbers);
	}
	
	@Test
	public void dataSet3() {
		int[] numbers = {-7,-4,-2,-1,0,1,2,4,8}; 
		getMissingNumberFromArray(numbers);
	}
	//Approach1
	public void getMissingNumberFromArray(int[] numbers) {
		Arrays.sort(numbers);
		for(int i=0; i<numbers.length-1; i++) {
			if(!(numbers[i]== numbers[i+1])) {
				int diff = numbers[i+1] - numbers[i];
				if(!(diff ==1))
					for(int j=1; j<diff; j++) {
					System.out.println(numbers[i]+j);
					}
			}
		}
	}
	//Approach2 (Working only for 1 missing number)
	public void getMissingNumberFromArray1(int[] numbers) {
		Arrays.sort(numbers);
		int n= numbers.length;
		int Total = ((n+1)*(n+2))/2;
		for(int i=0; i<n-1; i++) {
			Total -= numbers[i];
		}
		System.out.println(Total);
	}
}
