package day16_String;
/* 2. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"
 */
import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
boolean b = word.endsWith("ly");
if(b){
    System.out.println("really");
}else{
    System.out.println("never mind");
}
        System.out.println("=======================================");


    }
}
