package com.lambda.study;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Collection {
    final Function<String,Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

    public void compareLength(List<String> animals) {
        System.out.println(
                "length sum " + animals.stream().mapToInt(name->name.length()).sum()
        );
    }

    public long useFuctional(List<String> animals, String letter){
        return animals.stream().filter(startsWithLetter.apply(letter)).count();
    }
}
