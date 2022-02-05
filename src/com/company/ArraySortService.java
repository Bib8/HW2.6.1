package com.company;

import java.util.*;
import java.util.stream.Collectors;

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
            ArrayList<Integer> buff;
            anyType.sort(Integer :: compareTo);
            buff = (ArrayList<Integer>) anyType.stream().distinct().collect(Collectors.toList());
            oddSort(buff);
   }

    public void sortUniqOnly(String someText){
        ArrayList<String> buff = new ArrayList<>(Arrays.asList(someText.split(" ")));
        buff.sort(String :: compareTo);
        buff = (ArrayList<String>) buff.stream().distinct().collect(Collectors.toList());
        System.out.println(buff);
    }

    public void dublicateCount(String someText){
        int count = 0;
        ArrayList<String> buff = new ArrayList<>(Arrays.asList(someText.split(" ", ',')));
        System.out.println(buff);
        for (int i = 0; i < buff.size(); i++) {
            if (!buff.contains(buff.get(i))){
                buff.remove(buff.get(i));
                count++;
            }
        }


        System.out.println(count);
    }
}
