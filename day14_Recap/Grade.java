package day14_Recap;
/*  write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();; //closes
        String result = " ";
       if(score>=0 && score<=100){   //5 possible outcomes
       if(score>=90){
           result ="Excelent";
       }else if(score>=80){
           result = "Great";
       }else if(score>=70){
           result = "Good";
       }else if(score>=60){
           result = "Passed";
       }else{
           result = "Failed";
       }
       }else{
           result ="Invalid Entery";

       }
        System.out.println(result);



    }
}
