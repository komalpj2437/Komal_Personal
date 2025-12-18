package com.example.autowire.type;


import com.example.autowire.type.Specification;

public class Car {
    private Specification specification;

    public void DisplayDetails() {
        System.out.println("Car Details:" + specification.toString());
    }
    //constructor injection

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    //public Car(Specification specification) {
    //this.specification = specification;
}

