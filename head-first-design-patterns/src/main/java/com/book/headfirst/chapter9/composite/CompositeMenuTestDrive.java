package com.book.headfirst.chapter9.composite;

import com.book.headfirst.chapter9.composite.menu.Menu;
import com.book.headfirst.chapter9.composite.menu.MenuComponent;
import com.book.headfirst.chapter9.composite.menu.MenuItem;
import com.book.headfirst.chapter9.composite.waitress.Waitress;

public class CompositeMenuTestDrive {
    public static void main(String[] args) {
//        Menu pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        Menu dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
//        Menu cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        Menu dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요");

        dinerMenu.add(new MenuItem("채식주의자용 BLT",
                "통밀 위에 콩고기 베이컨, 상추 토마토",
                true,
                2.99));

        dinerMenu.add(new MenuItem("BLT",
                "통밀 위에 베이컨 상추 토마토",
                false,
                3.49));

        dessertMenu.add(new MenuItem("애플 파이",
                "바삭한 크러스츠에 바닐라 아이스크림이 얹혀 있는 애플 파이",
                true,
                1.49));

        dinerMenu.add(dessertMenu);

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
        allMenus.add(dinerMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
