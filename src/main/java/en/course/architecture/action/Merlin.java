package en.course.architecture.action;

import en.course.architecture.character.Hero;

public class Merlin implements Action{

    @Override
    public void action(Hero hero) {
        hero.setPvCurrent(hero.getPvMax());
    }
}
