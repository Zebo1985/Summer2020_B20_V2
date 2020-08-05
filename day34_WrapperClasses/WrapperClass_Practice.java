package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        Integer []arr2= {1,2,3,4};
        for(Integer each:arr2){
            System.out.println(each);
        }
double []arr3= {1,2,3,4,5,6,7};
Double[] arr4= {1.1,2.2,3.3,4.4}; //only dasimole
        for(Double each:arr4){
            System.out.println(each);
        }
        char[]arr5= {65,67,68,69,70};
        System.out.println(Arrays.toString(arr5));
        char ch = 79;
        Character ch1= 79;
        System.out.println(ch1);
        String[]num1 ={"11.5","12.5","13.5","14.5"};
        double []num2 = new double[num1.length];
        for(int i =0; i<=num1.length-1; i++){
            num2[i]=Double.parseDouble(num1[i]);
        }
        System.out.println(Arrays.toString(num2));


    }
}
