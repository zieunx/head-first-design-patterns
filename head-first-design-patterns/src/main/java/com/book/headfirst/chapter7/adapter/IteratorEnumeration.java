package com.book.headfirst.chapter7.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/* 쓰면서 제대로 공부하기 p287 */
public class IteratorEnumeration implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
