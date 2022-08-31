package com.book.headfirst.chapter9;

import com.book.headfirst.chapter9.menu.impl.CafeMenu;
import com.book.headfirst.chapter9.menu.impl.DinerMenu;
import com.book.headfirst.chapter9.menu.impl.PancakeHouseMenu;
import com.book.headfirst.chapter9.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        waitress.printMenu();
    }
}
