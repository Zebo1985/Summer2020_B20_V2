package day23_Arrays;

import java.util.Scanner;

/* no
*  */
public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String nonDup = "";   //"AB"
        String result = "";  //"A2B2"


        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);  //A, B, A, B
            if (!(nonDup.contains(ch))) {
                nonDup += ch;
            }

        }
        System.out.println(nonDup);
//"ABAB       "AB"

        for (int j = 0; j <= nonDup.length() - 1; j++) {  //removing duplicate
            char ch = nonDup.charAt(j);  //A
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;
                }
            }
            result += "" + ch + count;
        }
        System.out.println(result);

    }
}