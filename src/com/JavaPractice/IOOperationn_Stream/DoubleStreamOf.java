package com.JavaPractice.IOOperationn_Stream;

import java.math.BigDecimal;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class DoubleStreamOf {
    public static void main(String[] args) {
        DoubleStream stream=DoubleStream.of(2.4,5.6,1.9);

        stream.mapToObj(num->{return num+10;}).forEach(System.out::println);

        DoubleStream streams=DoubleStream.of(2.4,5.6,1.9);
        Stream<BigDecimal>  stream1=streams.mapToObj(BigDecimal::valueOf);

        stream1.forEach(num->System.out.println(num.add(BigDecimal.TEN)));
    }
}
