package menu;

/**
 * Created by Shur on 04.07.2016.
 * Цель:
 */
public class ItemMenu {
    int key = 0;
    String name = "";

    public ItemMenu (int key, String name){
        this.key =key;
        this.name = name;
    }
    public ItemMenu(int key, String name, Do d){
        this.key = key;
        this.name = name;
        d.doItem();
    }

}
