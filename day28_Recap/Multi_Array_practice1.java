package day28_Recap;

public class Multi_Array_practice1 {
    public static void main(String[] args) {
        String[] group1= {"Tati","Ivana","Altay","Cihan"};
        String[]group2= {"Diana","Harena","Neslihan","Ismet"};
        String[]group3={"Kelsey","Dilzat","Zebo","Anna"};
        String [] group4 =  {"Elvira", "Zeliha", "Paban","Asylkan"};
        String[]group5 ={"Dilyar", "Roza","Kamil", "Se dge"};
                    // 0        1     2        3        4
String[][]Batch20={group1, group2, group3, group4, group5};
for(int i=0; i<=Batch20.length-1;i++){  //each array
    String[] eachGroup = Batch20[i];
    for(int j=0; j<=eachGroup.length-1;j++){  //each name
        String eachStudent=eachGroup[j];
        if(eachStudent.toLowerCase().contains("a")){
            System.out.print(eachStudent+" ");
        }
    }
    System.out.println();


}



    }

}
