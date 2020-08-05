package day31_Pecap;

import Library.Util;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "SSGGYYEEDKJJHH";
String expectedResult = "";
String nonDup = Util.removeDup(str);

  for(char each: nonDup.toCharArray()){
      int count1 = Util.frequency(str, each);
      expectedResult+=""+each+count1;

  }


for( int i=0; i<=nonDup.length()-1; i++) {
    char ch1 = nonDup.charAt(i);
    int count1 = Util.frequency(str, ch1);
    expectedResult += "" + ch1 + count1;
}

   /*    char ch1 = nonDup.charAt(0);
       int count1 = Util.frequency(str, ch1);
       expectedResult+=""+ch1+count1;

        char ch2 = nonDup.charAt(1);
        int count2 = Util.frequency(str, ch2);
        expectedResult+=""+ch2+count2;

        char ch3 = nonDup.charAt(2);
        int count3 = Util.frequency(str, ch3);
        expectedResult+=""+ch3+count3;  */


        System.out.println(expectedResult);
        System.out.println("=========================================");
        String str2 = "shgkdjsahfdjgksf";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }
public static String frequencyOfChars(String str){
    String expectedResult = "";
    String nonDup = Util.removeDup(str);
    for(char each: nonDup.toCharArray()){
        int count1 = Util.frequency(str, each);
        expectedResult+=""+each+count1;
    }
    return expectedResult;
}



}

