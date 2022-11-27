package en.course.architecture.character;

import en.course.architecture.Utils;

public abstract class Fighter implements Character {
    protected int pvMax;
    protected float pvCurrent;
    protected int strenght;
    protected int armor;
    protected boolean alive;

    public void attack(Fighter fighter) {
        //Un lancer de dés12  on prends le résultat du lancer + la force attaquant – l’armure défenseur = pt de dégât au défenseur
        fighter.setPvCurrent(fighter.getPvCurrent() - (Utils.genererInt(1,12)+this.getStrenght() - fighter.getArmor()));
        if(fighter.getPvCurrent() <= 0) fighter.setAlive(false);
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public float getPvCurrent() {
        return pvCurrent;
    }

    public void setPvCurrent(float pvCurrent) {
        this.pvCurrent = pvCurrent;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
