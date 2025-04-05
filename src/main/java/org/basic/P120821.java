package org.basic;

import java.io.PrintStream;

public class P120821 {
    /**
     * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
     * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public void p120821() {
        int[] num_list = new int[]{1,2,3,4,5};
        int size = num_list.length;
        int[] answer = new int[size];

        int index = 0;
        for (int i = size-1; i >= 0; i--) {
            answer[index] = num_list[i];
            index++;
        }
        for (int i=0;i<size;i++) {
            System.out.println(answer[i]);
        }
    }
}
