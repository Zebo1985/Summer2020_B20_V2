package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek school";
        //             01234567
        // charAt(index):
        char ch1 = name.charAt(0);  //'C'
        char ch2 = name.charAt(5);   //'t'
        System.out.println(ch1);
        System.out.println(ch2);

         //lenght() ==> int
         int l = name.length();
         System.out.println(l);
         //last index:length of String - 1
int lastIndexnumber = name.length()-1;
        System.out.println(lastIndexnumber);
char lastChar = name.charAt(lastIndexnumber);
        System.out.println(lastChar);

           //concat(Str): concatenation
        String schoolName = "Cybertek";
        schoolName=schoolName.concat(" School"); //"Cybertek School
        System.out.println(schoolName);
        String r1 = "Cybertek"+ 123+ 'A'+true;
        System.out.println(r1);
        // toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
 name1 = name1.toLowerCase();  //"cybertek school"

        System.out.println(name1);
        // toUpperCase():
        String name2 = "sabrina";
        name2=name2.toUpperCase();
        System.out.println(name2);
        //trim():
        String p = "  Cybertek     School";
        p=p.trim(); //"Cybertek School"
        System.out.println(p);



    }
}
