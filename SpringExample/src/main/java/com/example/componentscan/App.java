package com.example.componentscan;

//import com.example.autowire.type.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext Context =
                new ClassPathXmlApplicationContext("ComponentScan.xml");
            Employee employee = (Employee) Context.getBean("employee");
            System.out.println(employee);

    }
}
