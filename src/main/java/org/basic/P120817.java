package org.basic;
import java.util.*;
import java.util.stream.Collectors;

public class P120817 {
    public void p120817() {
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        List<Integer> numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println((numList.get(numList.size()-1) + numList.get(0)) / (double) 2);

    }
}
