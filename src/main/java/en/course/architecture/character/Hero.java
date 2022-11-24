package en.course.architecture.character;

import en.course.architecture.Utils;

public class Hero extends Fighter{
    private int level;

    public Hero() {
        this.level = 1;
        this.armor = Utils.BASE_STAT_HERO_STRENGHT_ARMOR;
        this.strenght = Utils.BASE_STAT_HERO_STRENGHT_ARMOR;
        this.pvMax = Utils.BASE_STAT_HERO_PV;
        this.pvCurrent = this.pvMax;
    }

    public void levelUp(){
        // +10% hp current
        if(this.pvCurrent * 1.1 <= this.pvMax) this.pvCurrent *= 1.1;
        else this.pvCurrent = this.pvMax;

        // + 3 pt caractéristique
        this.upStat(3);
    }

    public void upStat(int statPoint){
        // declenche une boite de dialogue demandant au joueur comment répartir les points de stats
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "pvMax=" + pvMax +
                ", pvCurrent=" + pvCurrent +
                ", strenght=" + strenght +
                ", armor=" + armor +
                ", alive=" + alive +
                ", level=" + level +
                '}';
    }
}
