package com.book.headfirst.chapter9.menu.impl;

import com.book.headfirst.chapter9.menu.Menu;
import com.book.headfirst.chapter9.menu.MenuItem;

import java.util.*;

public class DinerMenu implements Menu<MenuItem> {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT",
                "통밀 위에 콩고기 베이컨, 상추 토마토",
                true,
                2.99);

        addItem("BLT",
                "통밀 위에 베이컨 상추 토마토",
                false,
                3.49);

        addItem("오늘의 스프",
                "false 샐러드를 곁들인 오늘의 스프",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("메뉴가 꽉 찼습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return Arrays.stream(menuItems).filter(Objects::nonNull).iterator();
    }
}
