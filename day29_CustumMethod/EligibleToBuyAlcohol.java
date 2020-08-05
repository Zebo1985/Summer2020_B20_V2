package day29_CustumMethod;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        calculator(100,'*',20);
    eligibleToBuyAlcohol(true, 19);

    }
    public static void eligibleToBuyAlcohol(boolean hasID, int age){

        if(hasID &&  age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }
    public static void calculator(double num1, char operator, double num2){
        // +, -, *, /,  %:
    switch (operator){
        case '+':
            System.out.println("Addition: "+(num1+num2));
            break;
        case '-':
            System.out.println("Subtraction: "+(num1-num2));
            break;
        case '*':
            System.out.println("Multipication: "+(num1*num2));
            break;
        case '/':
            System.out.println("Division: "+(num1/num2));
            break;
        case '%':
            System.out.println("Remainder: "+(num1%num2));
            break;
        default:
            System.out.println("Invalid operator");
    }
    }
}
