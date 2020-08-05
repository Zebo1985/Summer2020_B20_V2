package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email= email.replace("gmail","yahoo");
        System.out.println(email);
        String word = "java";
        word=word.replace("a","e");
        System.out.println(word);


        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence=sentence.replace("a, Java", "a, C#");

        sentence=sentence.replace("Java ","Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
     s1=s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1= s1.replace("MIT", "Cybertek");
        System.out.println(s1);
String s2 = "I like leaRn Java";
s2=s2.replace('R', 'r');
        System.out.println(s2);
        String s3 = "I like to drink tea and tea";
        s3= s3.replaceFirst("tea", "cola");
        System.out.println(s3);
 String s4 = "I like to Watch Game of thrones, and Walking dead";
s4= s4.replace(", and Walking dead", "");
        System.out.println(s4);
        //// indexOf()
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // return the first char 'r' index
        int r3 = s5.indexOf("rn");     // return the first char 'r' index
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
           // lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("J");
        System.out.println(I1);
        int I2 = s6.lastIndexOf("J");
        System.out.println(I2);
        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println(a1);
     String s8 = "Java";
     int a = s8.indexOf("a");
     char ch = s8.charAt(a);
        System.out.println(a);
        System.out.println(ch);
    }
}
