package com.lambda.study.domain.location;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kanadara13 on 2017-06-22.
 */
public class DistanceCalculatorTest {


    @Test
    public void calc(){
        DistanceCalculator dc = new DistanceCalculator();

        Double distance = dc.calculateByKillometer(new Location(37.595456, 126.952407, 37.508645, 127.048351));
        System.out.println(distance);
        if (3.5 > distance){
            System.out.println("less than " + 3.5);
        }else{
            System.out.println("more than " + 3.5);
        }
    }

}