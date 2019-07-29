package com.stackroute.spring.domain;

import com.stackroute.spring.domain.Actor;

import java.util.List;

public class Movie {
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

}
