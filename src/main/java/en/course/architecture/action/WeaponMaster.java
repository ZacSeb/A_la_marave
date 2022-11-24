package en.course.architecture.action;

import en.course.architecture.character.Hero;

public class WeaponMaster implements Action{
    @Override
    public void action(Hero hero) {
        hero.levelUp();
    }
}
