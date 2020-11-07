package com.xingray.javabase.interfaces;

/**
 * @author : leixing
 * <p>
 * description : Matcher
 */
public interface Filter<T> {

    /**
     * 是否保留
     */
    boolean keep(T t);
}
