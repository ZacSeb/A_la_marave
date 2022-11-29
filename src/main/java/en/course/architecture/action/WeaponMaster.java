package en.course.architecture.action;

import en.course.architecture.character.Hero;

public class WeaponMaster implements Action{
    @Override
    public void action(Hero hero) {
        hero.levelUp();
        System.out.println("Des codeurs pourris comme toi y'en à une tétra chié !");
    }
}
