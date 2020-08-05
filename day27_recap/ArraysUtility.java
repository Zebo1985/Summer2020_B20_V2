package day27_recap;

import java.util.Arrays;

// sort(), toString(),  equals();
public class ArraysUtility {
    public static void main(String[] args) {
String[] names = {"Odina","Liliya", "Berk", "Emina"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int []score = {80,75,65,110,90,45,56,78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Maximum number: "+score[score.length-1]);
        System.out.println("Minimum number: "+score[0]);
        System.out.println("====================================================");
        String[]s1= {"A","B", "C"};
        String[]s2= {"A","B", "C"};

        System.out.println(Arrays.equals(s1,s2));
        String[]s3= {"C","B", "A"};
        System.out.println(Arrays.equals(s1,s3));

        String[]a1= {"H","B", "A"};
        String[]a2= {"A","B", "H"};
        System.out.println(Arrays.equals(a1,a2));
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));


    }
}
