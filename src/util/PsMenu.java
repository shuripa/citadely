package util;

import game.Player;
import game.Players;

/**
 * Created by Shur on 28.06.2016.
 * Цель: Главное меню, выбор игрока
 */
public class PsMenu extends IMenu {
    Players ps;
    Player p;

    public PsMenu(){
        super(null);
        System.out.println("PsMenu.PsMenu()");
        nextMenu = new PMenu(this);
        //this.setPreviousMenu(this);
    }

    @Override
    public void showMenu() {
        System.out.println("PsMenu.showMenu()");
        //TODO: снять коментарий
//        ps = new Players();                 // Получение списка играков
        ps.PrintList();                     // Печать списка играков
        System.out.println();
        System.out.println("Выбор игрока:");
        choice = readChoice();              // Чтение выбора пользователя
        choiceMenu();                       // Реализация выбора пользователя
    }

    @Override
    public void choiceMenu() {
        p = ps.getPlayer(choice);           // Получение выбранного игрока
        System.out.println("Игрок: " + p.getName());
        //nextMenu.showMenu();
    }

    @Override
    public void initNextMenu() {
        if (super.nextMenu.equals(null)) super.nextMenu = new PMenu(this);
    }

    @Override
    public void actionMenu(int choice) {

    }
}
