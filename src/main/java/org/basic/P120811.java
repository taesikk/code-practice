package org.basic;

public class P120811 {
	public void p120811() {
		int[] array = new int[]{1,2,3,4,5};
		int[] sortArr = sort(array);
		System.out.println(sortArr[sortArr.length/2]);
	}

	public int[] sort(int[] array) {
		int length = array.length;

		for (int i = 0; i < length -1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIdx];
			array[minIdx] = temp;
		}

//		for (int i = 0; i < length; i++) {
//			for (int j = i+1; j < length; j++) {
//				if (array[i] < array[j]) {
//					int num = array[i];
//					array[i] = array[j];
//					array[j] = num;
//					i += 1;
//				} else {
//					result.
//				}
//			}
//		}
		return array;
	}
}
