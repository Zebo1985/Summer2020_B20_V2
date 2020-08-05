package Office_Hours.PracticeQuez;

public class switch_shortQuez_2 {
    public static void main(String[] args) {
        String opt = "true";
        switch (opt){
            case "true":
                System.out.println("true");
        break;
            default:
                System.out.println("false");//A
        }
        float f1 = (12345.1>12345.0)?12456 : 12456.02f;
        System.out.println(f1+1024);  //13480.

    }
}
