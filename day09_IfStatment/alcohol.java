package day09_IfStatment;
/* 4. write a java program that can identify if a person is eligible to buy alcohol

 */
public class alcohol {
    public static void main(String[] args) {
    boolean hasID = true;
    int age = 18;
    boolean eligible = hasID && age >=18;
        //           true &&  false ===> false
        String result = "";

        if (eligible== true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if (eligible==false){
           // System.out.println("Go buy your mikl");
          result = "You are not old enouph to buy alcohol";
        }
        System.out.println(result);
    }
}
