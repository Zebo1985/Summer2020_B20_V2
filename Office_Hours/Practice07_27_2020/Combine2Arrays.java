package Office_Hours.Practice07_27_2020;

public class Combine2Arrays {
    public static void main(String[] args) {
        char []a1={'A','B','C'};
        char []a2={'D','E','F'};
        char[]a3=new char[a1.length+a2.length];
       int index=0;
        for(char each:a1){
           a3[index]=each;
           index++;
        }




    }
}
