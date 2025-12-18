package com.example.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext Context =
                new ClassPathXmlApplicationContext("autowireByCons.xml");
                Car car = (Car) Context.getBean("myCar");
        car.DisplayDetails();


    }
}
