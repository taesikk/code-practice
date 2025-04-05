package org.basic;

public class P120824 {
    /**
     * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public void p120824() {
        int[] num_list = new int[]{1,2,3,4,5};
        int[] result = new int[2];
        int size = num_list.length;

        for (int i = 0; i < size; i++) {
            if (num_list[i]%2 == 0) {
                //짝수
                result[0]++;
            } else {
                result[1]++;
            }
        }
    }
}
