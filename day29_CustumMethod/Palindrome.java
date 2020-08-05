package day29_CustumMethod;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("rediveder");
        palindrome("level");
    }
    public static void palindrome(String word){
        String reverse = "";
        for(int i=word.length()-1; i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));
    }
}
