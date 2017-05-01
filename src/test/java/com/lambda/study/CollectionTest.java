package com.lambda.study;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.*;

/**
 * Created by user on 2017-05-02.
 */
public class CollectionTest {

    final List<String> animals = Arrays.asList("tiger","lion","bear","eagle");

    @Test
    public void useMap(){

        String listToString = animals.stream().map(String::toUpperCase).collect(joining("/"));
        System.out.println(listToString);

    }

}