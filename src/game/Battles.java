package game;

import java.util.ArrayList;

/**
 * Created by Shur on 22.06.2016.
 * Название: Бои
 * Цель: Демонстрация боев
 * 1) Содержит список боев
 */
public class Battles {
    private ArrayList<Battle> BattlesList = new ArrayList<>();

    public Battles(ArrayList<Player> p){
        BattlesList.add(new Battle("atac Wolv1 vs Ратуша 12", p.get(1), p.get(12)));
    }

    public ArrayList getBattles(){
        return BattlesList;
    }
}
