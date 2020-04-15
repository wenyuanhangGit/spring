package com.wen.spring.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycle) {
            System.out.println("8.BeanPostProcessor-postProcessAfterInitialization......");
        }
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycle) {
            System.out.println("5.BeanPostProcessor-postProcessBeforeInitialization......");
        }
        return bean;
    }

}