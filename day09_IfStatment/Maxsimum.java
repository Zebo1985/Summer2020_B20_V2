package day09_IfStatment;
/*  1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)

*/
public class Maxsimum {
    public static void main(String[] args) {
double a = 500;
double b = 200;
double c = 1000;
    boolean aIsMax = a>b && a>c;
    //500>200 && 500>1000
     //   true && false ===> false
    boolean bIsMax = b>a && b>c;
    // aIsMax == false && b>c
        boolean cIsMax = c>b && c>a;
       //  aIsMax ==false && bIsMax ==false//   !aIsMax && !bIsMax ==> !(aIsMax && bIsMax)
   double max = 0;
if(aIsMax){
    //System.out.println(a+ " is maxsimum number");
    max = a;
}
if(bIsMax){
    //  System.out.println(b+ " is maxsimum number");
    max = b;
}
if(cIsMax){
 //   System.out.println(c+ " is maxsimum number");
    max = c;
}
        System.out.println(max+" is maxsimum number");
    }
}
