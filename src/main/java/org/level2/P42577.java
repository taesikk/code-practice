package org.level2;

public class P42577 {
	/**
	 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
	 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
	 *
	 * 구조대 : 119
	 * 박준영 : 97 674 223
	 * 지영석 : 11 9552 4421
	 *
	 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
	 *
	 * ["119", "97674223", "1195524421"] - false 있어서 false
	 * ["123","456","789"]	true 없어서 true
	 * ["12","123","1235","567","88"]	false 있어서 false
	 */
	public void p42577() {
		String[] phone_book = new String[]{"119", "97674223", "1195524421"};

		int size = phone_book.length;
		boolean result = true;

		for (int i = 0; i < size; i++) {
			String temp = phone_book[i];
			for (int j = 0; j < size; j++) {
				String phone = phone_book[j];
				if (!temp.equals(phone) && temp.length() <= phone.length()) {
					int tempSize = temp.length();
					String splitPhone = phone.substring(0, tempSize);

					if (temp.equals(splitPhone)) {
						result = false;
						break;
					}
				}
			}
			if (!result) {
				break;
			}
		}
	}
}
