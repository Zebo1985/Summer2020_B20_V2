package day39_CostomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
       car1.setInfo("Lexus","RX350",2019,"White",14000,45000);
       car2.setInfo("Lexus","RX450",2020,"Black",1000,50000);
       car3.setInfo("Bugatti","Veyron",2018,"Blue",23000,50000);
       car4.setInfo("Fort","Escape",2020,"Red",1000,50000);
       car5.setInfo("Nissan","GT-R",2018,"Grey",23000,50000);
        car1.getInfo();
        car1.getInfo();
        car1.getInfo();
        car1.getInfo();
        car1.getInfo();

        car3.start();
        car5.start();
    }
}
