package com.stackroute.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public BeanLifeCycleDemoBean() {
    }

    public void destroy() throws Exception {
        System.out.println("Initialized InitializingBean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialized DisposableBean");
    }
    public void customInit(){
        System.out.println("Initialized customInit");
    }
    public void customDestroy(){
        System.out.println("Initialized customDestroy");
    }
}
