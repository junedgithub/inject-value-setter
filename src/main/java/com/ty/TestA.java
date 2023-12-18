package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("Name is: "+student.getName());
        System.out.println("Age is: "+student.getAge());
        System.out.println("Height is: "+student.getHeight());
    }
}
