package day39_CostomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
     /*car1.brand="Toyota";
     car1.model="Corolla";
     car1.year=2020;
     car1.color="White";
     car1.mileage=20000;
     car1.price=19500;*/

        car1.setInfo("Toyota","Corola", 2010,"Red",55000,16000);




        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);
        System.out.println("=================================================");
        Car car2 = new Car();
        /*car2.brand="Mercedes";
        car2.model="G 550";
        car2.year=2020;
        car2.color="Blue";*/
        car2.setInfo("BMW","X5",2018,"Black",15000,14000 );

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);




    }
}
