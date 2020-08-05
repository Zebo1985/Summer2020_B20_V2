package Office_Hours.Ptactice_07_14_2020;

public class Unique {
    public static void main(String[] args) {
String str = "ABABC";
String expectedResult ="";
for(int j=0; j<=str.length()-1; j++){
char ch = str.charAt(j);
int count=0; //freuency of ch
for(int i=0; i<=str.length()-1; i++){ //helps
   char each = str.charAt(i);
   if(each==ch){
       count+=1;
   }
}
if(count==1){
    expectedResult+=ch;
}
        System.out.println(expectedResult);
    }
}
}