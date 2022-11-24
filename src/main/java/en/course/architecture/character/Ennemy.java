package en.course.architecture.character;

import en.course.architecture.Utils;

public class Ennemy extends Fighter{
    public Ennemy(Hero hero) {
        this.strenght = Utils.BASE_STAT_BONUS_ENNEMY_STRENGHT_ARMOR+hero.getLevel();
        this.armor = Utils.BASE_STAT_BONUS_ENNEMY_STRENGHT_ARMOR+hero.getLevel();
        this.pvMax = Utils.BASE_STAT_BONUS_ENNEMY_PV+hero.getLevel();
        this.pvCurrent = this.getPvMax();
        this.setAlive(true);
    }

    @Override
    public String toString() {
        return "Ennemy{" +
                "pvMax=" + pvMax +
                ", pvCurrent=" + pvCurrent +
                ", strenght=" + strenght +
                ", armor=" + armor +
                ", alive=" + alive +
                '}';
    }
}
