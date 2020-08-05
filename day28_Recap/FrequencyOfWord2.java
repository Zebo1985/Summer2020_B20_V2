package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.next();
        // String str = "catcatcatdogdogdog";
        int count = 0;
        // (0,3)
        for(int i=0; i<=str.length()-3; i++){ //length -6;
            str.substring(i, i+3);// i+6
            if(str.substring(i, i+3).equalsIgnoreCase("cat")){ //python
                count++;
            }
        }

        System.out.println(count);



    }
}
