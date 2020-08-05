package day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3,};
        for (int n : arr) {
            int count = 0;
            for (int each : arr) {
                if (n == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(n);
            }
        }
        System.out.println();
        System.out.println("======================================");
        int[] n1 = {10, 20, 30, 30, 20, 40, 50, 50, 40, 80, 90, 80, 70, 90};
        uniqueElements(n1);
    }

    public static void uniqueElements(int[] arr) {
        for (int n : arr) {
            int count = 0;
            for (int each : arr) {
                if (n == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(n + " ");
            }
        }
    }
    public static void uniqueElements(double[] arr) {
        for (double n : arr) {
            int count = 0;
            for (double each : arr) {
                if (n == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(n + " ");
            }
        }
    }
            public static void uniqueElements ( char[] arr){
                for (char n : arr) {
                    int count = 0;
                    for (char each : arr) {
                        if (n == each) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        System.out.print(n + " ");
                    }

                }

            }

            public static void uniqueElements (String[]arr){
                for (String n : arr) {
                    int count = 0;
                    for (String each : arr) {
                        if (n == each) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        System.out.print(n + " ");
                    }
                }
            }
        }

