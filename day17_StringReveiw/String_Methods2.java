package day17_StringReveiw;

public class String_Methods2 {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");
        // equals
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s3==s2);//false
        System.out.println(s3.equals(s2));//true

        //equalsIgnorCase
        String s4 ="java";
        String s5 ="Java";
        System.out.println(s4.equals(s5)); //false
        System.out.println(s4.equalsIgnoreCase(s5));  //true
       String s6="SabRinA";
       String s7 = "Sabrina";
        System.out.println(s6.equalsIgnoreCase(s7)); //true
        System.out.println(s6.equals(s7)); //false

        //isEmpty:
    String str = " ";
        System.out.println(str.isEmpty());// false
        str = str.trim();







        // contains: included or not
        String str3 = "Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java")); //true
        System.out.println(str3.contains("java")); //false

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));  //true

        // startWith & endWith:
        String str5 = "Cybertek";
        System.out.println(str5.startsWith("Cyber"));
        





















    }
}
