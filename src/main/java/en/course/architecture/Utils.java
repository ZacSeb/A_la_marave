package en.course.architecture;

import java.util.Random;

public class Utils {
    public static final int BASE_STAT_BONUS_ENNEMY_STRENGHT_ARMOR = 12;
    public static final int BASE_STAT_BONUS_ENNEMY_PV = 25;
    public static final int BASE_STAT_HERO_PV = 30;
    public static final int BASE_STAT_HERO_STRENGHT_ARMOR = 15;
    public static final int NBR_TURN_GAME = 20;


    static int genererInt(){
        Random random = new Random();
        int nb;
        nb = 1+random.nextInt(4-1);
        return nb;
    }
}
