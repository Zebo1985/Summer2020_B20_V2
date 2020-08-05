package day25_Practice;

public class LongestString {
    public static void main(String[] args) {
        String[]arr={"Anam", "Nickolas", "Amir", "Nurmamet","Davlatmurod", "Muhammadali"};
        int maxLength= arr[0].length();
        for(String each:arr){
            if(each.length()>maxLength){
                maxLength=each.length();
            }
        }
        for(String each:arr){
            if (each.length()==maxLength){
                System.out.println(each);
            }
        }


    }
}
