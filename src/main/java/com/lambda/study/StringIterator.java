package com.lambda.study;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by kanadara13 on 2017-06-22.
 */
public class StringIterator {

    private final String test = "aaaa15153135nk15l134n14kl1n43kl1n4k1l4n1kl4n14ln14";

    public void iterator(final IntPredicate lambdaExpression){
        test.chars().filter(lambdaExpression)
                .forEach(ch-> System.out.println((char)ch));
    }
}
