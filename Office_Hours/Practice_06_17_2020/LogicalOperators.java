package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
        //           false!=true==>true
        System.out.println(r1);
        boolean r2 = ! r1;
        System.out.println(r2);
        System.out.println("==============================================");
        boolean res1 = 9>10 || "Java" == "Java" ||'A'=='a';
               //       false  || true || false
        System.out.println(res1);
 boolean res2 = "Java" != "Python" && "Muhtar"=="good guy";
                     //true && false

    }
}
