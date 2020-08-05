package day16_String;
/* Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true*/
import java.util.Scanner;

public class First_Last_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        scan.close();
    String word = scan.next();
    char firsChar = word.charAt(0);
    char lastChar = word.charAt(word.length()-1);
       // System.out.println(firsChar==lastChar);
if(firsChar==lastChar){
    System.out.println("true");
}else{
    System.out.println(false);

}



    }
}
