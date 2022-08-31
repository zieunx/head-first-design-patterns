package com.book.headfirst.chapter9.menu;

import java.util.Iterator;

public interface Menu<T> {
    Iterator<T> createIterator();
}
