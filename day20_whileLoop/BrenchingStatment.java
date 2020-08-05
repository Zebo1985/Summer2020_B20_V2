package day20_whileLoop;

public class BrenchingStatment {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch<='E'){
            if(ch=='C'){
                ch++;
                //continue;  // skips everything even the iterator
             break;

            }
            System.out.print(ch+" ");
            ch++;
        }
        while (true){
            System.out.println("Test started");
        //break;
            System.exit(0);
        }




    }
}
