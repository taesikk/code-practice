package org.basic;

public class P120826 {
	/**
	 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
	 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	 */
	public void p120826() {
		String my_string = "abcdef";
		String letter = "f";

		String result = "";
		String[] splitString = my_string.split("");
		int size = splitString.length;

		for (int i = 0; i < size; i++) {
			if (!splitString[i].equals(letter)) {
				result += splitString[i];
			}
		}
	}
}
