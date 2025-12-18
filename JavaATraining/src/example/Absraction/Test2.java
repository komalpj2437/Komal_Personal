package example.Absraction;

abstract class Vehicle{
    abstract void start();
    abstract void drive();
 }
class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }

    void drive() {
        System.out.println("Car driving");
    }
}
    class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starting");
    }
    void drive(){
        System.out.println("Bike driving");
    }
 }



public class Test2 {
    public static void main(String[] args) {
      //  Vehicle t =  new Car();
       Vehicle t=new Bike();
        t.drive();
        t=new Car();
        t.start();
    }
}
