package day17_StringReveiw;

public class Pool_VS_Heap {
    public static void main(String[] args) {
        String s1= "Cybertek"; //String pool
        String s2 = "Cybertek"; //String pool
        String s3 = new String("Cybertek"); // heap
        String s4 = new String("Cybertek"); // heap
        String s5= "Cybertek"; //String pool
        System.out.println(s1==s2);//false
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); // false
        System.out.println(s1==s5); // false
        System.out.println(s2==s5); // false

    }
}
