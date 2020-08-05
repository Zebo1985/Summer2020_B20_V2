package day18_ForLoop;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        String domain=email.substring(index1+1,index2);
        System.out.println(domain);




    }


}
