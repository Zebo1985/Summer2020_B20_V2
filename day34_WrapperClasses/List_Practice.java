package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<Integer>evenList=new ArrayList<>();
        ArrayList<Integer>oddList=new ArrayList<>();
        for(int i=0; i<=100; i++){
            if(i%2==0){
                evenList.add(i);
            }else {
                oddList.add(i);
            }
        }
        System.out.println(oddList);
        System.out.println(evenList);
        System.out.println("========================");
        ArrayList<String>groceryList=new ArrayList<>();
        groceryList.add("milk");
        groceryList.add("ice cream");
        groceryList.add("apple");
        groceryList.add("water");
        groceryList.add("mango");
        groceryList.add("egg");
        groceryList.add("bread");
        for(int i=groceryList.size()-1; i>=0; i--){
            System.out.print(groceryList.get(i)+" ");
        }
        System.out.println();
        for(String each:groceryList){
            System.out.print(each+" ");
        }
    }
}
