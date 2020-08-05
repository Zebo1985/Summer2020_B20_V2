package day10_IfStatments;

public class Character_Identify {
    public static void main(String[] args) {
        char character = 'A';    //
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        boolean isDigit = character>=48 && character<=57;
        //  upper case letter   ||    lower Case letter

        String alphabet= "";

        if (isAlphabetic == true) {
            //System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";
        }else{
            alphabet = character + " is not Alphabetic character";

            System.out.println(alphabet);
        }
           // System.out.println(character + " is not Alphabetic character");
String digit = "";
        if(isDigit==true){

            digit= character+ " is a digit";
        }else{
            digit = character+ " is not a digit";
        }
        System.out.println(digit);





        }
    }
