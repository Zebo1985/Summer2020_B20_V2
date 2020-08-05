package Office_Hours.Ptactice_07_14_2020;

public class UniqueWord {
    public static void main(String[] args) {
        String[]words= {"C#", "C#", "Python", "Python","Java"};


        for(String b:words){

            int count= 0;
            for(String each:words){
                if(each.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(b);
            }
        }





    }
}
