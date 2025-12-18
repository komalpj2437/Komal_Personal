package com.example.autowire.type;

import com.example.autowire.type.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext Context =
                new ClassPathXmlApplicationContext("autowireByType.xml");
                com.example.autowire.type.Car car = (Car) Context.getBean("myCar");
        car.DisplayDetails();


    }
}
