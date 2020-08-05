package day19_ForLoop;
/* 3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class SumOfEvenOdd {
    public static void main(String[] args) {
// task-3
        //0 2 4 6 8 ...100
      /* int sumOfEven = 0;
        for(int i = 0; i <=100; i+=2){
            sumOfEven+=i;   //sum of all even number
        }
        System.out.println(sumOfEven); */


        System.out.println("===============================================");
             // task-4
        // 1  3 5 7 9... 99
        int SumOfOdd= 0;
      /*  for(int i = 1; i<=99; i+=2 ){
            SumOfOdd+=i;
        }   */

for(int i = 0; i <=100; i++){
    if(i%2!=0){
     SumOfOdd+=i;
    }
}
 System.out.println(SumOfOdd);

            }
        }

