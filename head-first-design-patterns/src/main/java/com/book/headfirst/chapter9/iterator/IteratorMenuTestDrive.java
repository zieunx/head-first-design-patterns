package com.book.headfirst.chapter9.iterator;

import com.book.headfirst.chapter9.iterator.menu.impl.CafeMenu;
import com.book.headfirst.chapter9.iterator.menu.impl.DinerMenu;
import com.book.headfirst.chapter9.iterator.menu.impl.PancakeHouseMenu;
import com.book.headfirst.chapter9.iterator.waitress.Waitress;

public class IteratorMenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        waitress.printMenu();
    }
}
