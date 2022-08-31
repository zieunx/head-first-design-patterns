package com.book.headfirst.chapter9.iterator.menu;

import java.util.Iterator;

public interface Menu<T> {
    Iterator<T> createIterator();
}
