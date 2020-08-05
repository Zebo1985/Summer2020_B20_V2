package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        int age = 19;
        String citizen1 = "USA";
        String citizen2 = "France";
        boolean eligibleAge = age >= 18;
        // 12 >= 18 ==> false

        boolean usCitizen = citizen1== "USA" || citizen2 == "USA";
        // "USA" == "USA"  ||  "France" == "USA"
        //    true          ||    False

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                          true    &&   true ==>
        System.out.println(eligibleToVote);
String firstName =  "Sabrina";
String lastName = "Zairova";
String fulName = firstName+ " "+lastName;
        System.out.println(fulName + "is eligible to vote "+eligibleToVote);



    }
}
