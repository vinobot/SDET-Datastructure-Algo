package arrays;

import org.junit.Test;
//distinct and sorted array
public class FindIndexOfTarget {
	
	@Test
	public void dataSet1() {
		int[] input = {1,3,5,6};
		int target = 5;
		getTheIndexofTarget(input, target);
	}
	
	@Test
	public void dataSet2() {
		int[] input = {1,3,5,6};
		int target = 2;
		getTheIndexofTarget(input, target);
	}
	
	@Test
	public void dataSet3() {
		int[] input = {1,3,5,6};
		int target = 7;
		getTheIndexofTarget(input, target);
	}

	//Approach-1
	public void getTheIndexofTarget(int[] input, int target) {
		boolean targetFound = false;
		for (int i = 0; i < input.length; i++) {
				if(input[i] >= target) {
					System.out.println("Index of target is : "+i);
					targetFound = true;
					break;
				}
		}
		if(!targetFound) System.out.println("Target is not in array");
	}
		
}
