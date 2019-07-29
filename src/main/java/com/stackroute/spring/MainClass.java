package com.stackroute.spring;
import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.getActor());

        Actor actor = context.getBean("actor",Actor.class);
        System.out.println(actor);
    }
}

