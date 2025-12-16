package car.example.constructor.injection;

public class Car {
    private Specification specification;
     public void DisplayDetails(){
             System.out.println("Car Details:"+specification.toString());
        }

    public Car(Specification specification) {
        this.specification = specification;
    }
}
