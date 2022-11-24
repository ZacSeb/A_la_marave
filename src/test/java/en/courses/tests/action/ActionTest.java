package en.courses.tests.action;

import en.course.architecture.action.Merlin;
import en.course.architecture.character.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionTest {
    @Test
    public void ActionMerlin(){
        Hero hero = new Hero();
        hero.setPvCurrent(hero.getPvCurrent() - 10);
        assertEquals(hero.getPvCurrent(),20, 0.0001);
        Merlin merlin = new Merlin();
        merlin.action(hero);
        assertEquals(hero.getPvCurrent(),30, 0.0001);
    }
}
