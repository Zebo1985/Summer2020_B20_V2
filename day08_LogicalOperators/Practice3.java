package day08_LogicalOperators;

public class Practice3 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b ==2 || --b ==2 && --b ==2;
        //              3 == 2 ||  2==2 && 1==2
     //                    false || true && false
                             //   true && false
        System.out.println(res);
        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5;
        //             5 == 6 || 6 == 5
        //            r2 false || false

        System.out.println(r2);

        boolean A = true;
        boolean B = !A;
        boolean C = A != B && A == !B && !A == B;
          // true != false &&  true == true && false == false
        //       true    &&       true      && true
        System.out.println(C);


    }
}
