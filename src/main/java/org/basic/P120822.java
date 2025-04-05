package org.basic;

import java.util.*;
public class P120822 {
    /**
     * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public void p120822() {
        //jaron-noraj, bread-daerb
        String myString = "jaron";
        String[] splitString = myString.split("");
        int size = splitString.length;
        String result = "";
        int index = 0;

        for (int i = size-1; i>=0; i--) {
            result += splitString[i];
            index++;
        }


    }
}
