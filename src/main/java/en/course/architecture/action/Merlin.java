package en.course.architecture.action;

import en.course.architecture.character.Hero;

public class Merlin implements Action{

    @Override
    public void action(Hero hero) {
        System.out.println("Pv actuel du héro avant le heal : "+ hero.getPvCurrent());
        hero.setPvCurrent(hero.getPvMax());
        System.out.println("Pv actuel du héro après le heal : "+ hero.getPvCurrent());
    }
}
