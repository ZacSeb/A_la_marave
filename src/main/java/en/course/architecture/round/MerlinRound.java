package en.course.architecture.round;

import en.course.architecture.action.Action;
import en.course.architecture.action.Merlin;

public class MerlinRound extends Round{
    @Override
    Action createAction() {
        return new Merlin();
    }
}
