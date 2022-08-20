package com.JavaPractice.generic;

public class MultiGenericContainer<T,S> {
    private T first;
    private S second;

    public MultiGenericContainer(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
