package org.basic;

import java.util.HashMap;
import java.util.Map;

public class P120812 {
	public void p120812() {
		int[] array = new int[]{1,2,3,3,3,4};
		Map<Integer, Integer> result = func(array);

		System.out.println(result);
	}

	public Map<Integer, Integer> func(int[] array) {
		int length = array.length;
		int[] result = new int[length];
		Map<Integer, Integer> result2 = new HashMap<>();

		for (int i = 0; i < length; i++) {

			int idxCnt = 0;
			for (int j = 0; j < length; j++) {
				if (array[i] == array[j]) {
					idxCnt ++;
				}
			}
			if (!result2.containsKey(array[i])) {
				result2.put(array[i], idxCnt);
			}
			result[i] = idxCnt;
		}

		return result2;
	}
}
