package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        double a = 22/7.0;
        System.out.println(a);//3.142857142857143
        System.out.println(df.format(a));//3.14 ==>0.00
       //6.54398456===>6.54    //  6==>6.00;
        System.out.println(df.format(6.54398456));

    }
}
