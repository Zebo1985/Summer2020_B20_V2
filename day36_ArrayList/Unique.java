package day36_ArrayList;

import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        ArrayList<Integer>unique=new ArrayList<>();

       for(Integer element:list) {  //gets each element from list
           int count = 0;
           for (Integer each : list) { // find frequency
               if (each == element) {
                   count++;
               }

           }
           if (count == 1) {
               unique.add(element);
           }
       }
        System.out.println(unique);
    }
}
