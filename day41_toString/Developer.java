package day41_toString;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;
   public void setDeveloperInfo(String name, double salary,String gender, int age){
    }
    public void coding() {
        System.out.println(name + "is coding");
    }
    public void fixBug(){
        System.out.println(name+" is crying");
    }
public String toString(){
       return "Name "+name+" Salary "+salary+" Gender "+gender+"Age "+age;
}


}
