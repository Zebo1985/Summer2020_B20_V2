package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String[]student= {"Kalbinur","Vergina","Odina", "Ernis","Isa"};
        LocalDate[] birthDay={LocalDate.of(1982, 12,26),
                LocalDate.of(1993, 11,26),
                LocalDate.of(1980,05,23),
                LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28)};
                for(int i=0;i<=student.length-1; i++){
                    System.out.println(student[i]+" : "+birthDay[i]);
                }
        System.out.println("====================================================");
                for(LocalDate each:birthDay){

                }

        }
    }

