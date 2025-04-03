package org.basic;

public class P120814 {
	/**
	 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
	 */
	public void p120814() {
		// 7-1. 1-1, 15-3
		int pizza = 7;
		int num = 77;

		if (num < 8) {
			System.out.println(1);
		} else if (num % pizza == 0) { // 7의 배수인 경우엔 그냥 표시
			System.out.println(num/pizza);
		}else {
			System.out.println(num/pizza +1);
		}
	}
}
