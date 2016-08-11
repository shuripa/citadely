package ui.obsSquare;

/**
 * Created by Shur on 06.08.2016.
 * Цель:
 */

public interface SubSquare {
    public void registerSquare (ObsSquare o);
    public void unRegisterSquare (ObsSquare o);
    public void notifySquare (int activeGroup, int activeCell);
}
