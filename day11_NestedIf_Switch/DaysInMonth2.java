package day11_NestedIf_Switch;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 12;
        boolean validNumber = month>=1 && month<=12;

        boolean days28 = month==2; //for the months that has 28 days
        boolean days30=month==4||month==6||month==9||month==11;
        boolean invalid= month<1||month>12;

        String result = "";
        if(validNumber){ //for28 days,or 30 days, or 31 days
         if(days28){
              result = "28 Days";
         }else if(days30){
             result = "30 Days";
         }else{
             result = "31 Days";
         }

        }else{ // Invalid Month

        }
        System.out.println(result);



    }
}
