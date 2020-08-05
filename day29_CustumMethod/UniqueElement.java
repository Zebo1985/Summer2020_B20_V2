package day29_CustumMethod;

public class UniqueElement {
    public static void main(String[] args) {
        String [] arr={"A", "A", "B", "C", "C"};
        uniques(arr);
    }

    public static void uniques(String[] arr) {

        for(String a:arr) {  //gets each of the element
            int count = 0;
            for (String each : arr) { //gets the frequency of element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a);
            }
        }
        System.out.println();
    }
}