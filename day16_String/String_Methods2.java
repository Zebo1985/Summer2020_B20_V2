package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());
String name2 = "";
        System.out.println(name2.isEmpty());
String str1 = "Java";
String str2 = new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
//CONTAIN
        String str ="I like to learn java programming language";
        System.out.println(str.contains("python")); //false
        System.out.println(!str.contains("python")); // true



     // startsWith()
        String s2 = "Zebo";
        System.out.println(s2.startsWith("Z"));
        System.out.println(s2.startsWith("Ze"));






    }
}
