package com.xingray.javabase.interfaces;

public interface Mapper2<T1, T2, R> {
    R map(T1 t1, T2 t2);
}