package day19_ForLoop;
/* 5. Write a program that will print out all letters in English alphabet in
ascending order
    6. Write a program that will print out all letters in English alphabet in
    descedning order */
public class CharactersA_Z {
    public static void main(String[] args) {
// task-5
        for(char ch= 'A'; ch<='Z';ch++) {
    // ch <'Z'+1
    System.out.print(ch+" ");
}
        System.out.println();
for(int i = 97; i<=122; i++){
    char ch = (char)i;
    System.out.print(ch+" ");
}
        System.out.println();
        System.out.println("======================");
// task-6
        for(char ch ='z';ch>='a'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i = 90; i>=65; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("=================================================");
    for(int i =0; i<6500; i++){
        System.out.print((char)i+" ");
    }



    }
}
