package com.JavaPractice.IOOperationn_Stream;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class IntegerStreamOf {
    public static void main(String[] args) {
        IntStream is=IntStream.of(10,30,50);
        Stream<BigInteger> stream= is.mapToObj(BigInteger::valueOf);
        stream.forEach(num->System.out.println(num.add(BigInteger.TEN)));
    }

}
