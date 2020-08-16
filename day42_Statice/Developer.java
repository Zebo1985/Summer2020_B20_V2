package day42_Statice;

public class Developer {
    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender;
    public void setInfo(String name,char gender, long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public void smokeTesting(){
        System.out.println(name+" is coding");
    }
    public void creatingTicket(){
        System.out.println(name+" is fixing bud");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }


}
