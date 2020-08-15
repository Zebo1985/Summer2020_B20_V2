package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class BofA {
    public static void main(String[] args) {
        BankAccount Dawud=new BankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduvali","1122386654");
    Dawud.getAccountInfo();
Dawud.deposit(1000);
Dawud.checkBalance();
Dawud.withDraw(500);
Dawud.checkBalance(); //500

    }

    public static class CapitalOne {
        public static void main(String[] args) {
            BankAccount Beslan = new BankAccount();
            BankAccount Ahmet = new BankAccount();
            BankAccount Viorel = new BankAccount();
            BankAccount Nurmamat = new BankAccount();
            BankAccount Waqar = new BankAccount();
            Beslan.setAccountInfo("Checking", "Beslan", "4567890123");
            Ahmet.setAccountInfo("Checking", "Ahmet", "876543212");
            Viorel.setAccountInfo("Checking", "Viorel", "963258741");
            Nurmamat.setAccountInfo("Checking", "Nurmamet", "741258963");
            Waqar.setAccountInfo("Checking", "Waqar", "852147963");


            ArrayList<BankAccount> accounts = new ArrayList<>();
            accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmamat,Waqar));
    for(BankAccount each:accounts){
        each.deposit(500);
        each.getAccountInfo();
    }
    accounts.get(3).deposit(1000);
    accounts.get(3).checkBalance();
    accounts.get(3).withDraw(900);
    accounts.get(3).checkBalance();
    accounts.get(4).deposit(600);
    accounts.get(4).checkBalance();
            System.out.println("************************************************************************");
            accounts.removeIf(  each -> each.balance < 1000 );
            System.out.println(accounts.size());
            /*
            for(BankAccount each : accounts){
                each.getAccountInfo();
            }
             */
        }
    }
}
