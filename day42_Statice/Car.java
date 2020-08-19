package day42_Statice;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;
    static boolean hasWheel=true;
    static int numberOfTires=4;
    static boolean hasEngine=true;
    static boolean hasDoor=true;
    static boolean hasAirBag=true;
    static boolean hasSeatBelt=true;
    static boolean hasHorn=true;

    public void start(){
        System.out.println("Starting "+brand+" "+model);
    }
    public static void printTires(){
        System.out.println(numberOfTires+" Tires");
    }
    public String toString(){
        return "Breand: "+brand+", Model: "+model+", Year: "+year+", Color: "+color
        +"\nNumner of tires: "+numberOfTires+"\nHas Engine: "+hasEngine
                +"\nHas Wheel: "+hasWheel+"\nHas door: "+hasDoor+"\nHas Airbag: "+hasAirBag;



    }
}
