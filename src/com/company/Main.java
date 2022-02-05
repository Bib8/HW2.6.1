package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums2 = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 5, 6, 7, 4, 4, 5, 8));
        String testText = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur, temporibus!" +
                " consectetur adipisicing elit. Consequuntur, temporibus!" +
        "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur,";


        ArraySortService sortService = new ArraySortService();
        sortService.oddSort(nums);
        System.out.println("----------------=====================---------------");
        sortService.sortOddOnly(nums2);
        System.out.println("----------------=====================---------------");
        sortService.sortUniqOnly(testText);
        System.out.println("----------------=====================---------------");
        sortService.dublicateCount(testText);


    }



}
