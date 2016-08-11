package warriors;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class WarSup extends WarProp {
    private Typs.Super type;
    private int num;

    public WarSup(Typs.Faction faction, Typs.Branch branch, Typs.Race race, Typs.Pol pol, Typs.Super type, int num){
        super(faction, branch, race, pol);
        this.type = type;
        this.num =num;
    }
}
