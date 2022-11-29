package en.course.architecture.round;

import en.course.architecture.action.Action;
import en.course.architecture.action.Battle;

public class FightRound extends Round{
    @Override
    Action createAction() {
        return new Battle();
    }
}
