package com.korit.main;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<Integer> numberList3 = null;

        numberList2 = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            Integer num = numberList.get(i);
            numberList2.add(num*10);

        }

        numberList3 = new ArrayList<>();

        for (int i = 0; i < numberList2.size(); i++) {
            numberList3.add(numberList2.get(i));
        }


        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);

        }
    }
