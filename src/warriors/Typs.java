package warriors;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class Typs {
    //Фракция
    public enum Faction {AnyFaction, Order, Barbarian, Mag, Unique;
        public String toString() {
            switch (this) {
                default: return "Неизвестно";
                case AnyFaction: return "Неизвестно";
                case Order: return "Орден";
                case Barbarian: return "Варвар";
                case Mag: return "Маг";
                case Unique: return "Уникум";
            }
        }
    }
    //Род войск
    public enum Branch {AnyBranch, Infantry, Arrows, Cavalery;
        public String toString(){
            switch (this) {
                default: return "Неизвестно";
                case AnyBranch: return "Неизвестно";
                case Infantry: return "Пехота";
                case Arrows: return "Лучник";
                case Cavalery: return "Кавалерия";
            }
        }
    }
    //Раса
    public enum Race {AnyRace, Human, Elemental, Frostling, Felid, Undead, Mechanism, Saurians, Gnome, Barling, Amazon;
        public String toString(){
            switch (this) {
                default: return "Неизвестно";
                case AnyRace: return "Неизвестно";
                case Human: return "Человек";
                case Elemental: return "Элементаль";
                case Frostling: return "Фростлинг";
                case Felid: return "Фелид";
                case Undead: return "Нежить";
                case Mechanism: return "Механоид";
                case Saurians: return "Заурианин";
                case Gnome: return "Гном";
                case Barling: return "Борлинг";
                case Amazon: return "Амазонка";
            }
        }
    }
    //Пол
    public enum Pol {AnyPol, Male, Female;
        public String toString(){
            switch (this){
                default: return "Неизвестно";
                case AnyPol: return "Неизвестно";
                case Male: return "Муж";
                case Female: return "Жен";
            }

        }
    }
    //Превосходство
    public enum Super {Attack, Protection;
        public String toString(){
            switch (this){
                default: return "Атака";
                case Attack: return "Атака";
                case Protection: return "Защита";
            }
        }
    }
}
