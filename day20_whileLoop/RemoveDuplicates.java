package day20_whileLoop;
/*  write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc*/

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //String str = "aabb";  //"ab"
        //    0123
        String result=" ";
        for(int i =0; i<=str.length()-1; i+=1){
          // String s =
            String s= " "+str.charAt(i); // a, a, b, b.
            if(!result.contains(s)){ // if the character is already containedin result
                result+=s;
            }
        }
        System.out.println(result);
    }
}
