package com.lambda.study.domain.defaultMethod;

/**
 * Created by user on 2017-06-18.
 */
public class SeaPlane extends Vehicle implements FasterFly, Sail {

    public void cruise(){
        FasterFly.super.cruise();
    }

    public void takeOff(){
        FasterFly.super.takeOff();
    }

   /* @Override
    public void land() {

    }

    @Override
    public void turn() {

    }*/
}
