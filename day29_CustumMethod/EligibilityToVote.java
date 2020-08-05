package day29_CustumMethod;

public class EligibilityToVote {
    /*
    age, citizen,name
     */
    public static void main(String[] args) {
        vote("John",28, true, "Biden");
    }
  public static void vote(String name, int age, boolean citizen, String candidateName) {
      boolean eligibleToVote = age >= 18 && citizen == true;
      if (eligibleToVote) {
          System.out.println(name + "is eligible to vote for " + candidateName);
      } else {
          System.out.println(name + " is not eligible to vote");
      }
  }

}
