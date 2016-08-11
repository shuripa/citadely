package util;

/**
 * Created by Shur on 28.06.2016.
 * Цель: Меню игрока
 */
public class PMenu extends IMenu{

    public PMenu (IMenu previousMenu){
        super(previousMenu);
        System.out.println("PMenu.PMenu()");
    }

    @Override
    public void showMenu() {
        System.out.println("PMenu.showMenu()");
        System.out.print("0)Выбор игрока. ");
        System.out.print("1)Атака. ");
        System.out.print("2)Защита. ");
        System.out.println();
    }

    @Override
    public void choiceMenu() {
        switch (choice){
            case 0: previousMenu.showMenu();

        }
    }

    @Override
    public void initNextMenu() {

    }

    @Override
    public void actionMenu(int choice) {

    }
}
