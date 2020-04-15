package com.wen.spring.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String xml = "bean(beanlifecycle).xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        BeanLifeCycle bean = applicationContext.getBean(BeanLifeCycle.class);
        System.out.println(bean);
        applicationContext.refresh();
        applicationContext.close();
    }

}
