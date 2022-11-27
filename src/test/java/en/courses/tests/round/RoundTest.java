package en.courses.tests.round;

import en.course.architecture.Utils;
import org.junit.Test;

public class RoundTest {
    @Test
    public void round(){
        for(int i = 0; i < 90; i++){
            System.out.println(Utils.genererInt(1,5));
        }
    }
}
