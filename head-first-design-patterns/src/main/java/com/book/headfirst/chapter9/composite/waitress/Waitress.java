package com.book.headfirst.chapter9.composite.waitress;

import com.book.headfirst.chapter9.composite.menu.Menu;
import com.book.headfirst.chapter9.composite.menu.MenuComponent;
import com.book.headfirst.chapter9.composite.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }
}
