package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Shur on 04.07.2016.
 * Цель:
 */
public abstract class menuListInterface {
    BufferedReader br;
    String choiceS = ""; // выбор пункта меню
    int choice = 0;
    ArrayList<ItemMenu> items = new ArrayList<>();

    public menuListInterface(){
    }

    public Integer readChoice(){
        System.out.println("IMenu.readChoice()");
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            choiceS = br.readLine();
        }catch (IOException ioe){

        }
        return Integer.parseInt(choiceS);
    }

}
