package com.Ioc.coupling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationIocLoseCoupling.xml");
        UserManager userDB = (UserManager) context.getBean("userData");
        UserManager webDB = (UserManager) context.getBean("webData");
        System.out.println("Userdata is :" + userDB.getUserinfo());
         }

      }



