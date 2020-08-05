package day29_CustumMethod;

public class MethodWithOutParameter2 {
    public static void main(String[] args) {
        printHello5Xs();
        System.out.println("Cybertek");
        printHello5Xs();
        System.out.println("Zebo");
        printHello5Xs();

    }


    public static void printHello5Xs() {
        for (int i = 10; i > 6; i--) {
            System.out.println("Hello");
        }

    }
}