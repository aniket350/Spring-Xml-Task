package com.stackroute.spring;
import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie.getActor());

        Movie movie2 = context.getBean("movie", Movie.class);
        System.out.println(movie2.getActor());
        System.out.println(movie == movie2);


        //beanLifeCycleDemoBean
        ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean demoBean=(BeanLifeCycleDemoBean) context1.getBean("Beanlifecycledemo",BeanLifeCycleDemoBean.class);
        context1.close();
    }
}