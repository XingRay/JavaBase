package com.xingray.javabase.interfaces;

public interface Converter<A, B> {

    /**
     * A-> B
     */
    B to(A a);

    /**
     * B -> A
     */
    A from(B b);
}
