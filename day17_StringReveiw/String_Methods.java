package day17_StringReveiw;

public class String_Methods {
    public static void main(String[] args) {
        // charAt(index)
        String str = "Cybertek";
        //            01234567 they are index numbers
       char ch1 = str.charAt(7);
        System.out.println(ch1);

        // +:
        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        // length()==>int
        String str3 = "Cybertek";
        int l = str3.length(); //8
        System.out.println("legth: "+l);
//    lastindex: length - 1
        char ch2 = str3.charAt(l-1); //length()-1
        System.out.println(ch2);
        System.out.println("last index: "+(l-1));

//   upperCase & lowerCase
        String str4 = "cybertek";
        str4=str4.toUpperCase(); //"CYBERTEK
        System.out.println(str4);

String str5 = "JAVA";
str5 = str5.toLowerCase();
        System.out.println(str5); //java

//     trim()
        String str6= "     Cybertek      ";
        System.out.println(str6);
        str6=str6.trim();  // "Cybertek"
        System.out.println(str6);

        //  substring:
        String str7 = "I like Java Language";
                  //   012345678910
     String word = str7.substring(7,10+1);//"Java
        System.out.println(str7);
        System.out.println(word);
      String word2 = str7.substring(12,str7.length());
       String word3 = str7.substring(12);
      System.out.println(word2);
        System.out.println(word3);

        //    indexOf & lastIndexOf===> int
        String str8 = "Hello Batch 20, Have a Wonderful day";
        int i1=str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));
        String str9 = "Java Java Java";
        int i4=str9.lastIndexOf("J");
        int i5 = str9.lastIndexOf("J");
        System.out.println(i4);
        System.out.println(i5);
// replace & replaceFirst
        String s1 = "I like Java, Java is programming language";





    }
}
