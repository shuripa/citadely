package game.obscwarriors;


import warriors.Warrior;

/**
 * Created by Shur on 07.08.2016.
 * Цель: Субъект выбора войска
 */
public interface SubWarriorsI {
    public void registerCol (ObsWarriorsI o); //Col - колонка
    public void unRegisterCol (ObsWarriorsI o);
    public void notifyCol (Warrior warrior);
}
