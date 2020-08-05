package day19_ForLoop;

public class contiunueStatment {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            if(i==3){
                continue; // jumps to next iteration
            }

            System.out.print(i+" ");  // 1 2 4 5
        }
        System.out.println();
        System.out.println("===================================");
    for(char ch ='A'; ch <='F'; ch++){

        System.out.print(ch+" ");

        if(ch=='C' || ch=='F'){
            continue;
        }
        System.out.print(ch+" ");
        }






    }
}
