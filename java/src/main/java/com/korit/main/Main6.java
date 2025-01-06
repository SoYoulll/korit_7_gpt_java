package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Authority<T> implements Supplier<T> {
    private T role;


    @Override
    public T get() {
        return role;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Runnable runnable;
        // ㄴ Thread(Main 메서드의 역할)

        Consumer<String> consumer;
        // ㄴ 매개변수로 값을 받아서 해당 값을 처리 , 처리한 결과를 return 해주지는 않음

        Supplier<String> supplier;
        // ㄴ 매개변수로 값을 받지 않고 처리한 데이터를 return 해주는 역할

        Function<String , String> function;
        // ㄴ 매개변수로 값을 받아서 처리한 데이터를 return 해주는 역할

        Predicate<String> predicate;

        BiConsumer<Integer, String> biConsumer;

        BiFunction<Integer, Integer, String> biFunction;

        BiPredicate<Integer, Integer> biPredicate;

        UnaryOperator<Integer> unaryOperator;

        BinaryOperator<Double> binaryOperator;

    }
}
