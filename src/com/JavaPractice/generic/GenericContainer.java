package com.JavaPractice.generic;

public class GenericContainer<T> {
    private T object;

    public GenericContainer() {
    }

    public GenericContainer(T object) {
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
