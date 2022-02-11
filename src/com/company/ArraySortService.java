package com.company;

import java.util.*;


public class ArraySortService {

    public ArraySortService() {
    }

    public void oddSort(List<Integer> anyType){
        for (Integer integer : anyType) {
            if (integer % 2 == 0) {
                System.out.println(integer.intValue());
            }
        }
    }

    public void sortOddOnly(List<Integer> anyType){
         Set<Integer> sortOddOnlyArray = new TreeSet<>(anyType);
         for(int num: sortOddOnlyArray) {
             if (num % 2 == 0){
                 System.out.println(num);
             }
         }

   }

    public void sortUniqOnly(List<String> someText){
        Set<String> uniqSorted = new HashSet<>(someText);
        System.out.println(uniqSorted);
    }



    public void dublicateCount(List<String> someText){
        Set<String> uniq = new HashSet<>(someText);
        System.out.println((someText.size() - uniq.size()));
    }




}
