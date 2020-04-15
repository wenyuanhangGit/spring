package com.wen.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String xml = "bean(bean).xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        Person person = (Person) applicationContext.getBean("person");
        applicationContext.refresh();
        System.out.println(person);
    }

}
