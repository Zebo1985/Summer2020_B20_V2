package day29_CustumMethod;

public class ReverseString {
    public static void main(String[] args) {
        reverse("Sabrina");
        reverse("Dilura");
        reverse("Behruz");
    }
    public static void reverse(String str){
        String result ="";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
