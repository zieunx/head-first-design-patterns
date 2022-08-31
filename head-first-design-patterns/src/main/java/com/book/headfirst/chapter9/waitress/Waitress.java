package com.book.headfirst.chapter9.waitress;

import com.book.headfirst.chapter9.menu.Menu;
import com.book.headfirst.chapter9.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    Menu<MenuItem>[] menus;

    @SafeVarargs
    public Waitress(Menu<MenuItem> ... menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu<MenuItem> menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator<MenuItem> iterator) {
        System.out.println("============================================");
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println();
    }
}
