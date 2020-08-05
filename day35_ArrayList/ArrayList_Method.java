package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<String>earlyBirdList=new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Sabrina");
        earlyBirdList.add("Behruz");
        earlyBirdList.add("Dilnura");
        earlyBirdList.add("Abdulloh");
        System.out.println(earlyBirdList);

        earlyBirdList.set(2,"Arslon");
        earlyBirdList.set(0,"Ifora");
        System.out.println(earlyBirdList);
earlyBirdList.clear();
        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());
        System.out.println("========================================");
    ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

       list.remove(2);
       list.remove(3);
        System.out.println(list);
// non primitive  remove (Element)
        System.out.println("=============================================");
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
Integer a=1;
list2.remove(a);
        System.out.println(list2);
ArrayList<String>list3=new ArrayList<>();
        list3.add("Hamit");       //0
        list3.add("Hamida");      //1
        list3.add("Hamitjon");    //2
        list3.add("Hamitbek");    //3
        list3.add("Hamidaoy");    //4
        list3.remove(2);
       list3.remove("Hamit");
        System.out.println(list3);
 list3.remove("amida");
 list3.remove("Hamida");
        System.out.println(list3);


    }
}
