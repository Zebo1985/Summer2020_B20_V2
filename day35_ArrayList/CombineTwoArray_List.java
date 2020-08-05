package day35_ArrayList;

import java.util.ArrayList;

public class CombineTwoArray_List {
    public static void main(String[] args) {
        String[] group1 = {"Aliya", "Aslan", "Ernis", "Muhammad"};
        String[] group2 = {"Ali", "Zarina", "Irina", "Davud", "Fatima"};
        ArrayList<String> studentList = new ArrayList<>();
        for (String each : group1) {
            studentList.add(each);
        }
        for (String each : group2) {
            studentList.add(each);

        }
        System.out.println(studentList);
    }
}