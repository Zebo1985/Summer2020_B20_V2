package day10_IfStatments;

public class MultiBranch {
    public static void main(String[] args) {
        int num = 100;
        if(num>0){
            System.out.println(num+ " is positiv");
        }
        if(num<0){
            System.out.println(num+ " is negative");
        }
        if(num == 0){
            System.out.println(num+" is zero");
        }
        System.out.println("============================================");
if(num>0){
    System.out.println(num+ " is positiv");
}else if( num<0){
    System.out.println(num+ " is negative");
}else{  //num==0
    System.out.println(num+" is zero");

}




    }
}
