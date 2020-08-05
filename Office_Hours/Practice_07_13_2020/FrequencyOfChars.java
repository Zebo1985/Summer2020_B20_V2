package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "OOPQQ"; // O2P1Q2
        String nonDup ="";
//Remove duplicates
        for(int i =0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i); // O  O  P  Q  Q
            if( ! nonDup.contains(s)){ // if the character is not already exist then we concate it to the nonDup
                nonDup += s;
            }
        }

        String result = "";  //  O2P1Q2

    for(int j =0; j<=nonDup.length()-1; j++){
        char ch = nonDup.charAt(j);  // O
    int count = 0; // 1+1=2
    for( int i =0;i<=str.length()-1; i++ ) {  // counting frequency of ch
        char each = str.charAt(i);// O O P Q Q
        if (each == ch) {
            count++;
        }
    }
        result=""+ch+count;

}

        System.out.println(result);

    }
}
