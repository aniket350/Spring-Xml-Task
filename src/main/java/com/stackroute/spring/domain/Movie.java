package com.stackroute.spring.domain;

import com.stackroute.spring.domain.Actor;
public class Movie {

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;
}
