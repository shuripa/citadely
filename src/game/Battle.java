package game;

/**
 * Created by Shur on 22.06.2016.
 * Название: Битва
 * Цель:
 * 1) Создать армию нападающего;
 * 2) Создать армию обороняющегося;
 * 3) Провести бой
 */
public class Battle {
    private String name;
    private Player attacPlayer;         //Атакующий
    private Player protectionPlayer;    //Защищающийся


    public Battle(String name, Player attacPlayer, Player protectionPlayer){
        this.name = name;
        this.attacPlayer = attacPlayer;
        this.protectionPlayer = protectionPlayer;
    }

}
