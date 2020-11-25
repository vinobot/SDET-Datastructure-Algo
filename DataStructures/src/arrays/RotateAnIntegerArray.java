package arrays;

import java.util.Arrays;

import org.junit.Test;

public class RotateAnIntegerArray {
	
	@Test
	public void dataSet1() {
		int[] input = {4,6,3,8,2,9,1,36};
		int N=4;
		rotateAnIntegerArray(input, N);
	}
	
	@Test
	public void dataSet2() {
		int[] input = {4,6,3,8,2,9,1,36};
		int N=9;
		rotateAnIntegerArray(input, N);
	}
	
	@Test
	public void dataSet3() {
		int[] input = {4,6,3,8,2,9,1,36};
		int N=7;
		rotateAnIntegerArray(input, N);
	}
	//Approach-1
	public void rotateAnIntegerArray(int[] input, int N) {
		if(N <= input.length) {
		int[] tempArray = new int[N];
		for (int i = 0; i < N; i++) {
			tempArray[i] = input[i];
		}
		for (int i = N; i < input.length; i++) {
			input[i-N] = input[i];
		}
		for (int i = 0; i < tempArray.length; i++) {
			input[i+ input.length-N] = tempArray[i];
		}
		System.out.println(Arrays.toString(input));
	}
		else System.out.println("N value should be less than input array length");
	}

}
