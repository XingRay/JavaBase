package com.xingray.javabase.interfaces;

public interface Mapper<T, R> {
    R map(T t);
}