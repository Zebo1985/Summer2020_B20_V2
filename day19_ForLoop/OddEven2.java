package day19_ForLoop;
/* 3. print odd numbers between 1 to 50
    4. print even number between 1 to 50

* */
public class OddEven2 {
    public static void main(String[] args) {
        for(int i = 0;i<=50; i++){
            if (i % 2 != 0) {  // if the number is odd, then skip

                continue;
            }
                System.out.print(i + " ");
            }
        System.out.println();
        for(int i = 0;i<=50; i++){
            if (i % 2 == 0) {  // if the number is even, then skip

                continue;
            }
            System.out.print(i + " ");
        }






    }
    }

