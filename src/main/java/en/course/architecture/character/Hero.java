package en.course.architecture.character;

import en.course.architecture.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hero extends Fighter{
    private int level;

    public Hero() {
        this.level = 1;
        this.armor = Utils.BASE_STAT_HERO_STRENGHT_ARMOR;
        this.strenght = Utils.BASE_STAT_HERO_STRENGHT_ARMOR;
        this.pvMax = Utils.BASE_STAT_HERO_PV;
        this.pvCurrent = this.pvMax;
        this.setAlive(true);
        try {
            upStat(12);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void levelUp(){
        // +10% hp current
        if(this.pvCurrent * 1.1 <= this.pvMax) this.pvCurrent *= 1.1;
        else this.pvCurrent = this.pvMax;
        this.setLevel(getLevel() + 1);
        // + 3 pt caractéristique
        try {
            this.upStat(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * used for
     * @param statPoint
     * @throws IOException
     */
    public void upStat(int statPoint) throws IOException {
        // declenche une boite de dialogue demandant au joueur comment répartir les points de stats
        boolean flag = false;

        while(!flag){
            int total = 0;
            System.out.print("Bienvenue dans le répartiteur de stat !");
            System.out.print("\n");
            System.out.print("Vous devez ajouter "+ statPoint+ " points a vos statistiques");
            System.out.print("\n");

            int strenghtBonus = askStat("force");
            int armorBonus = askStat("armure");
            int pv = askStat("pv");

            if(strenghtBonus+armorBonus+pv == statPoint){
                this.setArmor(getArmor() + armorBonus);
                this.setStrenght(getStrenght() + strenghtBonus);
                this.setPvMax(getPvMax() + pv);
                this.setPvCurrent(getPvCurrent() + pv);
                flag = true;
            } else {
                System.out.println("Vous n'avez pas rensseigné exactement "+ statPoint+ " au total");
            }
        }
    }

    /**
     * Only usefull for refactoring code, the app can be ruled without this
     * @param text
     * @return
     */
    public int askStat(String text){
        System.out.println("Combien voulez rajouter en "+text);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = 0;
        try {
             value = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
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
