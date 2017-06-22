package com.lambda.study;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

/**
 * Created by kanadara13 on 2017-06-22.
 */
public class StringIteratorTest {


    @Test
    public void onlyNumber(){
        StringIterator st = new StringIterator();
        st.iterator(ch->Character.isDigit(Integer.parseInt(String.valueOf(ch))));
    }


    @Test
    public void all(){
        StringIterator st = new StringIterator();
        //st.iterator();
    }
}