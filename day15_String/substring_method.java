package day15_String;

public class substring_method {
    public static void main(String[] args) {
        String sentens = "Java is fun";
        //                0123456789...
        // substring(beg index, end index);
        String word1 = sentens.substring(0,4);
        System.out.println(word1);
String word2 = sentens.substring(8,10+1);
        System.out.println(word2);
        System.out.println("====================================");
String sentens2 = "I like Movies and TV Series";
//                 0123456789...
String word3 = sentens2.substring(7,13);
        System.out.println(word3);
        System.out.println("=================================");
        String lastName = "MUHTAR";
        String firstChar = lastName.substring(0,1);
        String remaining = lastName.substring(1, 6);
        lastName= firstChar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lastName);
        System.out.println("=================================");
        String s = "I like Game Of Thrones";
        //          01234567
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming Language";
       //            01234567
        String language = s2.substring(7);
        System.out.println(language);

    }
}
