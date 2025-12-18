package car.example.setter.injection;


public class Car {
    private Specification  specification;
     public void DisplayDetails(){
             System.out.println("Car Details:"+specification.toString());
        }
        //setter injection


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
