package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {

    /*write a program that can find the maximum number from any given two dimensional array
        solution one: use nested for loops
        solution two: use nested for each loops
        solution three: use for loop and for each loop together*/

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,16,17,18,19,20}};
        int max= arr2D[0][0];
     for(int[] each1D: arr2D){ //to get each 1D Array;
     for(int eachNum :each1D){ //to get each element
        if(eachNum>max){
            max=eachNum;
        }
    }
}
        System.out.println("Maximum: "+max);



    }
}
