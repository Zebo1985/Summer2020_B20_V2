package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "catcatcatcatdogdogdog";
        str=str.toLowerCase();
        int countcat =0;
        while (str.contains("cat")){
            countcat++;
            str=str.replaceFirst("cat", "");
        }
        int countdog =0;
        while (str.contains("dog")){
            countdog++;
            str=str.replaceFirst("dog", "");
        }


        System.out.println(countcat);
        System.out.println(countdog);
        System.out.println(countcat==countdog);
    }
}
