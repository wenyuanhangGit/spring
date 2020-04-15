package com.wen.spring.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, InitializingBean, ApplicationContextAware, DisposableBean {

    private ApplicationContext applicationContext;
    
    public BeanLifeCycle() {
        System.out.println("1.new BeanLifeCycle......");
    }

    public void setBeanName(String name) {
        System.out.println("2.BeanNameAware-setBeanName......");
    }

    public void setBeanFactory(BeanFactory bf) throws BeansException {
        System.out.println("3.BeanFactoryAware-setBeanFactory......");
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("4.ApplicationContextAware-setApplicationContext......");
        this.applicationContext = context;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("6.InitializingBean-afterPropertiesSet......");
    }

    public void initMethod() {
        System.out.println("7.init-method......");
    }

    public void destroy() throws Exception {
        System.out.println("9.DisposableBean-destroy.....");
    }

    public void destroyMethod(){
        System.out.println("10.destroy-method.....");
    }
}
