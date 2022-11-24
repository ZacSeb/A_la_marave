package en.course.architecture.action;

import en.course.architecture.character.Ennemy;
import en.course.architecture.character.Fighter;
import en.course.architecture.character.Hero;

public class Battle implements Action{
    @Override
    public void action(Hero hero) {
        Fighter ennemy = new Ennemy(hero);
        while(hero.isAlive() && ennemy.isAlive()){

        }
    }
}
