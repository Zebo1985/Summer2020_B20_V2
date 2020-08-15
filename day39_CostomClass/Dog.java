package day39_CostomClass;

public class Dog {
    /*
    instance variables:
    breed, size, age, color, name
    instance methods:
    setDogInfo, getDogInfo, eat, drink, sleep,...
     */
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor) {
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }

    // sets the info the dog
/*
dog1: husky
dog2: pitbull
dog3: golden retriever
 */
    public void getDogInfo() {
        System.out.println("Name: " + name + ",Breed: " + breed + ", Size: " + size + ", Color: " + color + ", Age: " + age + " years old");
    }

    // prints dog info
    public void eat(String food) {
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink) {
        System.out.println(name+" is drinking "+drink);
    }
public void sleep(){
    System.out.println(name+" is sleeping");
}

}