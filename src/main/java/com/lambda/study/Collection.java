package com.lambda.study;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Collection {
    final Function<String,Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

    final Function<String,String> orderBy = name -> name;

    public void compareLength(List<String> animals) {
        System.out.println(
                "length sum " + animals.stream().mapToInt(name->name.length()).sum()
        );
    }

    public long useFuctional(List<String> animals, String letter){
        return animals.stream().filter(startsWithLetter.apply(letter)).count();
    }

    public void sort(List<String> animals) {

        System.out.println("forEachOrdered no comparing");
        animals.stream().forEachOrdered(each->{
            System.out.println(each);
        });

        System.out.println("forEach no comparing");
        animals.stream().forEach(each->{
            System.out.println(each);
        });

        System.out.println("forEachOrdered");
        animals.stream().sorted(comparing(orderBy)).forEachOrdered(each->{
            System.out.println(each);
        });
        System.out.println("forEach");
        animals.stream().sorted(comparing(orderBy)).forEach(each->{
            System.out.println(each);
        });

        System.out.println("last");
        List<String> orderedAnimals = animals.stream().sorted((each1, each2) -> each1.compareTo(each2)).collect(Collectors.toList());
        orderedAnimals.stream().forEach(e->{
            System.out.println(e);
        });

        System.out.println("last");
        animals.stream().sorted(Comparator.comparing(orderBy)).collect(Collectors.toList());
        orderedAnimals.stream().forEach(e->{
            System.out.println(e);
        });
    }
}
