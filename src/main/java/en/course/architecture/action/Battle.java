package en.course.architecture.action;

import en.course.architecture.Utils;
import en.course.architecture.character.Ennemy;
import en.course.architecture.character.Fighter;
import en.course.architecture.character.Hero;

public class Battle implements Action{
    private Fighter fighterWhoStart;
    private Fighter ennemy;

    @Override
    public void action(Hero hero) {
        this.ennemy = new Ennemy(hero);
        if(Utils.genererInt(0,100) < 65) fighterWhoStart = hero;
        else fighterWhoStart = this.ennemy;
        while(hero.isAlive() && ennemy.isAlive()){
            // un tape, l'autre juste après jusqu'a un des deux meurt
            if(fighterWhoStart instanceof Hero) {
                hero.attack(this.ennemy);
                if(this.ennemy.isAlive()) this.ennemy.attack(hero);
            } else {
                this.ennemy.attack(hero);
                if(hero.isAlive()) hero.attack(this.ennemy);
            }

        }
    }
}
