package warriors;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class WarProp {


    private Typs.Faction faction;
    private Typs.Branch branch;
    private Typs.Race race;
    private Typs.Pol pol;


    public WarProp(Typs.Faction faction, Typs.Branch branch, Typs.Race race, Typs.Pol pol){
        this.faction = faction;
        this.branch = branch;
        this.race = race;
        this.pol = pol;
    }
}
