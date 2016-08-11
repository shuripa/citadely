package menu;

import java.util.ArrayList;

/**
 * Created by Shur on 04.07.2016.
 * Цель:
 */
public class menuList{

    ArrayList<menuList> ar = new ArrayList<>();
    menuList ml;
    ItemMenu im;
//    public menuList(){
//    }

    public void menuList2(){
        //super(0,"Корневое меню");
//        im = new ItemMenu(0,"Меню 0", ()-> System.out.println("Меню 0 - Реализация 0"));
//        ar.add(im);
       // ml = new menuList (1,"Меню 1", ()-> System.out.println("Меню 1 - Реализация 1"));
        ar.add(ml);
        System.out.println(ar);

    }
}
