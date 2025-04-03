package org.basic;

public class P120815 {
	/**
	 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
	 * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 */
	public void p120815() {
		// 6-1, 10-5, 4-2
		int n = 10;
		int pizza = 6;
		int result = 0;
		// n의 배수에서 pizza가 나누어 떨어지는 값 / pizza

		for (int i = 1; i < 1000; i++) {
			int temp = n * i;
			if (temp % pizza == 0) {
				result = temp / pizza;
				break;
			}
		}
		System.out.println(result);
	}
}
