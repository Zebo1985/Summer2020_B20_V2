package day11_NestedIf_Switch;

public class NestedIf {
    public static void main(String[] args) {
        int score =100;
        String res = "";
        if(score>=0 && score<=100){  // valid score
            if(score>=90){
                res = "A";
            }else if(score>=80){
                res ="B";
            }else if(score>=70){
                res = "C";
            }else if(score>=60){
                res = "D";
            }else{
                res = "F";
            }
        }else{  //invalid score
            res = "invalid";
        }
        System.out.println(res);





    }
}
