package com.xingray.javabase.interfaces;

public interface Mapper<T, V> {
    V map(T t);
}