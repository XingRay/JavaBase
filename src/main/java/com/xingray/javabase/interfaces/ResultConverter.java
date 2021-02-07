package com.xingray.javabase.interfaces;

import com.xingray.javabase.result.Result;

public interface ResultConverter<A, B> {

    /**
     * A-> B
     */
    Result<B> to(A a);

    /**
     * B -> A
     */
    Result<A> from(B b);
}
