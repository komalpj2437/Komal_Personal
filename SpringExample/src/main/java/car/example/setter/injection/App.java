package car.example.setter.injection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context1=
                new ClassPathXmlApplicationContext("ApplicationSetterInjection.xml");
                    Car mycar=(Car)context1.getBean("myCar");
        mycar.DisplayDetails();


    }
 }
