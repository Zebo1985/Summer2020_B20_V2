package day29_CustumMethod;

/* 1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100
*/
public class Method_Practice {
    public static void main(String[] args) {
        oddNumber();
        System.out.println("hello");

        evenNumber();
        System.out.println("hello");
    }
    public static void oddNumber(){
        for(int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

// task 2:
    }

    public static void evenNumber(){
        for(int i= 0; i<=100; i+=2){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}

