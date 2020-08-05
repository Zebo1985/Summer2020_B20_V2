package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice {
    public static void main(String[] args) {
        String [] testers = {};
        String [] developers = {};
        String [] SM = {};
        String [] PO= {};
        String[] BA ={};

        String[][] scrumTeam = {testers, developers, SM, PO,BA};
for(String[] each:scrumTeam){
   for(String name:each){
       System.out.println();
   }
    System.out.println(Arrays.toString(each));
}
        System.out.println("=========================================================");
int[][] scores = {{10,20,30,45}, {60,55,75,105}, {93,48, 125,135} };
for(int[] each1DArray:scores){
    for(int eachElement:each1DArray){
        System.out.print(eachElement+" ");
        if(eachElement%3==0 || eachElement%5==0){
            System.out.print(eachElement);
        }


    }
}




    }
}
