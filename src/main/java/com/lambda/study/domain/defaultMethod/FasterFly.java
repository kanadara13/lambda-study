package com.lambda.study.domain.defaultMethod;

/**
 * Created by user on 2017-06-18.
 */
public interface FasterFly extends Fly {
    default void takeOff() {
        System.out.println("FasterFly :: takeOff");
    }
}
