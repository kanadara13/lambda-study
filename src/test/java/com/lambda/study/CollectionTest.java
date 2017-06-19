package com.lambda.study;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static org.mockito.Mockito.mock;

/**
 * Created by user on 2017-05-02.
 */
public class CollectionTest {

    final List<String> animals = Arrays.asList("tiger","lion","bear","eagle","tortoise");

    Collection collection = new Collection();

    @Test
    public void listToJoin(){
        String listToString = animals.stream().map(String::toUpperCase).collect(joining("/"));
        System.out.println(listToString);
    }

    @Test
    public void reduce(){
        collection.compareLength(animals);
    }

    @Test
    public void refactoring(){
        System.out.println(collection.useFunctional(animals,"t"));
        System.out.println(collection.useFunctional(animals,"l"));
        System.out.println(collection.useFunctional(animals,"b"));
        System.out.println(collection.useFunctional(animals,"e"));
    }

    @Test
    public void sorting(){
        collection.sort(animals);
    }
}