package org.basic;

import java.util.*;

public class P120813 {
	public void P120813() {
		int num = 15;
		int[] result = func(num);
		//return result;
	}

	public int[] func(int num) {
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) { // 짝수이면
				result.add(i);
			}
		}

		System.out.println(result);
		int[] a = result.stream().mapToInt(Integer::intValue).toArray();

		return a;
	}
}
