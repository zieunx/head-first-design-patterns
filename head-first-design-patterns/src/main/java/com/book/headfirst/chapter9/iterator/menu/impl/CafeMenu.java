package com.book.headfirst.chapter9.iterator.menu.impl;

import com.book.headfirst.chapter9.iterator.menu.Menu;
import com.book.headfirst.chapter9.iterator.menu.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu<MenuItem> {
    Map<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable<>();

        addItem("오늘의 스프",
                "샐러드가 곁들여진 오늘의 스프",
                false,
                2.99);

        addItem("부리토",
                "푸짐한 부리토",
                true,
                3.49);

        addItem("베지 버거",
                "베지버거",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
