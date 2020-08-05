package Office_Hours.Ptactice_07_14_2020;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3};

        for(int b:arr) {

            int count = 0; //for the frequency of num in the arr
            for(int each:arr){
                if(each==b) {
                    count++;

                }
            }
            if(count==1){
                System.out.println(b);
            }
        }




            }
        }



