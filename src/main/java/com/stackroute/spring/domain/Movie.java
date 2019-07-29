package com.stackroute.spring.domain;

import com.stackroute.spring.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    List<Actor> actor;

    public Movie() {
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public Movie(List<Actor> actor) {
        this.actor= actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Implemented Beanfacotry");
    }

    public void setBeanName(String s) {
        System.out.println("Implemented BeanName");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Implemented ApplicationContext");
    }
}
