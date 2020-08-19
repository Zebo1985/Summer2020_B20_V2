package day42_Statice;

public class Circle {
    double radius;
    double diameter;
   static double pi=3.14;
public void setInfo(double radius){
    this.radius=radius;
    diameter=radius*2;
}
public double calcArea(){
    return radius*radius*pi;
}
public double calcPerimetr(){
    return 2*radius*pi;
}
    public String toString(){
        //return "The area of the circle with the radius of" +radius +" is: "+calcArea();
   return "Radius: "+radius+"\nDiametr: "+diameter+"\nPi: "+pi+"\nArea: "+calcArea()+"\nPerimetr: "+calcPerimetr();
    }
}
