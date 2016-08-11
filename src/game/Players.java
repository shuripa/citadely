package game;

import game.obsarmy.SubArmyI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sun.net.www.http.HttpCapture;

import java.util.ArrayList;

/**
 * Created by Shur on 22.06.2016.
 * Название: Игроки
 * Цель: Содержит список играков
 */


public class Players {

    private ArrayList <Player> playersList = new ArrayList<Player>();
    //private ObservableList <String> playersListNames = FXCollections.observableArrayList();
    private ObservableList <String> playersListNames = FXCollections.observableArrayList();
    //private ObservableList<String> playersListNames = new ObservableList<String>()

    public Players(){
        addPlayer(0, "Ратуша6", 6);
        addPlayer(1, "Wolverine1", 12);
        addPlayer(2, "Wolverine2", 11);
        addPlayer(3, "Wolverine3", 10);
        addPlayer(4, "Wolverine4", 9);
        addPlayer(5, "Айвова", 10);
        addPlayer(6, "Другой12", 12);
        addPlayer(7, "Ратуша7", 7);
        addPlayer(8, "Ратуша8", 8);
        addPlayer(9, "Ратуша9", 9);
        addPlayer(10, "Ратуша10", 10);
        addPlayer(11, "Ратуша11", 11);
        addPlayer(12, "Ратуша12", 12);
        addPlayer(13, "Ратуша13", 13);
        addPlayer(14, "Ратуша14", 14);
    }

    public void addPlayer (int index, String name, int townHall){
        playersList.add(index, new Player(name, townHall));
        playersListNames.add(index, name);
    }

    public ArrayList<Player> getPlayersList(){
        return this.playersList;
    }

    public Player getPlayer(int index){
        return playersList.get(index);
    }

    public Player getPlayer(String name){
        Player p = playersList.get(0);
        for (Player pp: playersList) {
            if (pp.getName() == name) p = pp;
        }
        return p;
    }

    public ObservableList<String> getPlayersListNames (){
        return playersListNames;
    }

//TODO: лишняя функциональность (если убрать меню)
    public void PrintList (){
        for (Player p : playersList) {
            System.out.print(playersList.indexOf(p)+")" + p.getName() + "  ");
        }
    }



}
