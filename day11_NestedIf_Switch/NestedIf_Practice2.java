package day11_NestedIf_Switch;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 4;
        boolean validNum = day >= 1 && day <= 7;
        String res = " ";
        if (validNum) {
           /* if(day==7){
                res = "Sunday";
            }else if(day ==6){
                res = "Saturday";
            }else if(day == 5){
                res = "Fiday";
            }else if(day ==4){
                res = "Thuesday";
            }else if(day ==3){
                res = "Wednesday";
            }else if( day ==2 ){
                res ="Tuesday";
            }else if(day==1){
                res = "Monday";
            }
            System.out.println(res);

        }else{ // invalid num
            res = "invalid";
            System.out.println(res);

        }
*/
            res = (day == 7) ? "Sunday" : (day == 6) ? "Saturday" : (day == 5) ? "Fiday"
                    : (day == 4) ? "Thuesday" : (day == 3) ? "Wednesday" : (day == 2) ? "Tuesday"
                    : "Monday";
        }
        System.out.println(res);



    }
}