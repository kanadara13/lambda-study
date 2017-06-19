package com.lambda.study.domain.defaultMethod;

/**
 * Created by user on 2017-06-18.
 */
public interface Sail {

    default void cruise() {
        System.out.println("Sail::cruise");
    }

    default void turn(){
        System.out.println("Sail::turn");
    }
}
