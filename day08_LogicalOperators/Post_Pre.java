package day08_LogicalOperators;
/*3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
*/
public class Post_Pre {
    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
    //   b = -200+ -200 * 200 %2

 // b = -200 - 40000 % 2
        //  b = -200 - 0 =-200
        System.out.println(b);
        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
    // z = 300+400-300*400+300/400
    // z= 300+400-120000+(0.75)=0 because integer=0
    // z= 700-120000=-500
        System.out.println(z);



    }
}
