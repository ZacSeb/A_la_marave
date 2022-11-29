package en.course.architecture.round;

import en.course.architecture.action.Action;
import en.course.architecture.action.WeaponMaster;

public class WeaponMasterRound extends Round{
    @Override
    Action createAction() {
        return new WeaponMaster();
    }
}
