package day33_LocalDateTime;

import java.util.Arrays;

/*
 1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order

 */
public class SortDescending {
    public static void main(String[] args) {
        int[]arr = {1,4,3,5,2};
        Arrays.sort(arr); //{1,2,3,4,5}
        System.out.println(arr);
        int[]desc= new int[arr.length]; //{5,4,3,2,1}
        desc[0]=arr[arr.length-1];
        desc[1]=arr[3];
        desc[2]=arr[2];
        desc[3]=arr[1];
    desc[desc.length-1]=arr[0];
    int k= arr.length-1;
    for(int i=0; i<=desc.length-1; i++){
        desc[i]=arr[k];
        k--;
    }
        System.out.println(Arrays.toString(desc));
        System.out.println("=================================");
        int[] scores={40,50,70,80,100,60,90};
        scores=sortDesc(scores);
        System.out.println(Arrays.toString(scores));
    }
    public static int[]sortDesc(int[]arr){
        Arrays.sort(arr);
        int desc[]=new int[arr.length];
        int k =arr.length-1;
        for(int each:arr){
        desc[k]=each;
        k--;
}
        return desc;
    }
    public static  double[] sortDesc(double[] d){
        double[]desc=new double[d.length];
        int i = d.length-1;
        for(double each:d){
            desc[i]=each;
            i--;
        }
        return desc;
    }
    public static  String[] sortDesc(String[] arr) {
        String[] str = new String[arr.length];
        Arrays.sort(arr);
        int i = arr.length - 1;
        for (String each : arr) {
            str[i] = each;
            i--;
        }
        return str;
    }
    public static  char[] sortDesc(char[] arr) {
        char[] ch = new char[arr.length];
        Arrays.sort(arr);
        int i = arr.length - 1;
        for (char each : arr) {
            ch[i] = each;
            i--;
        }
        return ch;
    }

}
