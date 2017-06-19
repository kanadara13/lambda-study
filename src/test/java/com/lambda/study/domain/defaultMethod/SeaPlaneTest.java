package com.lambda.study.domain.defaultMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2017-06-18.
 */
public class SeaPlaneTest {

    @Test
    public void defaultTest(){
        SeaPlane seaPlane = new SeaPlane();
        seaPlane.cruise();
        seaPlane.takeOff();
    }
}