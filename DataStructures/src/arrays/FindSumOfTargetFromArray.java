package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindSumOfTargetFromArray {

	@Test
	public void dataSet1() {
		int[] input = {1,3,4,2,8};
		int target = 5;
		getIndicesOfSum(input,target);
	}
	
	@Test
	public void dataSet2() {
		int[] input = {1,3,4,2,8,5,5,8};
		int target = 10;
		getIndicesOfSum(input,target);
	}
	
	public void getIndicesOfSum(int[] input, int target) {
		List<Integer[]> ls = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<input.length; i++) {
			if(map.containsKey(target-input[i]) ) {
				ls.add(new Integer[] {map.get(target-input[i]),i});
			}
			map.put(input[i], i);
		}
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(Arrays.toString(ls.get(i)));
		}
	}
}
