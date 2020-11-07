package com.xingray.javabase.interfaces;

/**
 * @author : leixing
 * <p>
 * description : Filter
 */
public interface Filter<T> {

    /**
     * 是否保留
     */
    boolean keep(T t);
}
