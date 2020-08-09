package day39_CostomClass;

public class Car {
    /*
    model, brand, year, color, mileage, VIN...
     */

        String brand;
        String model;
        String color;
        int year;
        double mileage;
        double price;
        public void setInfo(String carBrand,String carModel,int carYear,String carColor,double carMileage,double carPrice){
                brand=carBrand;
                model=carModel;
                color=carColor;
                year=carYear;
                mileage=carMileage;
                price=carPrice;
        }

        public void getInfo(){

                System.out.println(year+" "+brand+" "+color+", "+mileage+", "+model+", $"+price);
        }
        public void start(){
                System.out.println(brand+" "+model+" is started");
        }

}

