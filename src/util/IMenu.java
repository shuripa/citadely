package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shur on 29.06.2016.
 * Цель:
 */
public abstract class IMenu {
    BufferedReader br;
    String choiceS; // выбор пункта меню
    int choice;
    IMenu previousMenu;
    IMenu nextMenu;

    public IMenu(IMenu previousMenu){
        System.out.println("IMenu.Imenu()");
        this.previousMenu = previousMenu;
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
    public void activateMenu(){
        System.out.println("IMenu.activateMenu()");
        this.showMenu();
        choice = readChoice();
        initNextMenu();
        nextMenu.showMenu();
   }

    public abstract void showMenu();
    public abstract void choiceMenu();
    public abstract void initNextMenu();
    public abstract void actionMenu (int choice);

}
