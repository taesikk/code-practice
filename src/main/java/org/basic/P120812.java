package org.basic;

public class P120812 {
	public void p120812() {
		int[] array = new int[]{1,2,3,3,3,4};
		int[] result = func(array);
		for (int a : result) {
			System.out.println(a);
		}
	}

	public int[] func(int[] array) {
		int length = array.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			int idxCnt = 0;
			for (int j = 0; j < length; j++) {
				if (array[i] == array[j]) {
					idxCnt ++;
				}
			}
			result[i] = idxCnt;
		}

		return result;
	}
}
