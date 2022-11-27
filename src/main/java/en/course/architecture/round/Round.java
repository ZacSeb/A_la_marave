package en.course.architecture.round;

import en.course.architecture.action.Action;
import en.course.architecture.character.Hero;

public abstract class Round {
    abstract Action createAction();

    public void createRound(Hero hero){
        Action action = createAction();
        action.action(hero);
        System.out.println(action.getClass());
    }
}
