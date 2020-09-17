package study.planner.test;

import org.junit.Test;
import study.planner.StudyException;
import study.planner.StudyPlanner;

import java.util.Scanner;

public class StudyPlannerTest {
    @Test
    public void testScanner() throws StudyException {
        String str = "4\n" +
                "10 20 Programozasi Nyelvek Java\n" +
                "150 190 Analizis\n" +
                "20 130 Analizis\n" +
                "55 78 Programozasi Nyelvek Java";

        StudyPlanner stp = new StudyPlanner();
        stp.readPagesFromText(new Scanner(str));
        stp.
    }

}
