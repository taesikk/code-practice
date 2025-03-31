package org.basic;

import java.util.*;

public class P120812 {
	public void p120812() {
		int[] array = new int[]{1,2,3,3,3,4,4,4};
		List<Integer> result = func(array);

		System.out.println(result);
	}

	public List<Integer> func(int[] array) {
		int length = array.length;
		Arrays.sort(array); // sort
		HashMap<Integer, Integer> temp = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		int maxCnt = 0;
		for (int i = 0; i < length; i++) {
			int idxCnt = 0;
			for (int j = 0; j < length; j++) {
				if (array[i] == array[j]) {
					idxCnt ++;
				}
			}
			if (idxCnt > maxCnt) {
				maxCnt = idxCnt;
			}
			if (!temp.containsKey(array[i])) {
				temp.put(array[i], idxCnt);
			}
		}

		for (Integer k : temp.keySet()) {
			if (temp.get(k) == maxCnt) {
				result.add(k);
			}
		}

		return result;
	}
}
