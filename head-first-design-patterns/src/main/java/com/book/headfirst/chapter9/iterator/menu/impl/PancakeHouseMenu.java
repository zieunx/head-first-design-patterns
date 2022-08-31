package com.book.headfirst.chapter9.iterator.menu.impl;

import com.book.headfirst.chapter9.iterator.menu.Menu;
import com.book.headfirst.chapter9.iterator.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu<MenuItem> {
    List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {
        addItem("레귤러 팬케이크 세트",
                "달걀 프라이와 소시지가 곁들여진 팬케이크",
                false,
                2.99);

        addItem("블루베리 팬케이크",
                "신선한 블루베리와 블루베리 시럽이 들어간",
                true,
                3.49);

        addItem("와플",
                "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
