package com.stackroute.spring;


import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public BeanPostProcessorDemoBean() {
        System.out.println("Initialized BeanPostProcesorDemoBean");
    }
}
