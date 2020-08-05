package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        int age = 19;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA"; //or age > 17
       //                         19>=18    &&  "China" == "USA"
       //                           true              false
        System.out.println(eligibleToVote);
String firstName = "Zebo";
String lastName = "Ubaydullaeva";
        int Age = 19;
        String CitizenShip = "USA";
String fullName = firstName+ " "+lastName;
        System.out.println(fullName+ " is eligible to vote: "+eligibleToVote );
boolean r6 = !true && false;
boolean r7 = !false && 9>8;
        System.out.println(r6);
        System.out.println(r7);

//////////////////////////////////////
        //     ||: or
        boolean r8 = true == ! false || false == true;
        System.out.println(r8);
        boolean r9 = !false == false || true == !false;

        System.out.println(r9);
        boolean r10 = !false == false && true == !false;

        System.out.println(r10);










    }
}
