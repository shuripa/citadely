package game.obsarmy;

/**
 * Created by Shur on 08.08.2016.
 * Цель:
 */
public interface SubArmyI {
    public void registerArmy (ObsArmyI o, int ind); //Col - колонка
    public void unRegisterArmy (ObsArmyI o);
    public void notifyArmy (int activeGroup);
}
