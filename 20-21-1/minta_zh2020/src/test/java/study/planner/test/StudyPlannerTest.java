package study.planner.test;

import org.junit.Test;
import static org.junit.Assert.*;

import study.planner.StrictStudyPlanner;
import study.planner.StudyException;
import study.planner.StudyPlanner;

import java.util.Scanner;

public class StudyPlannerTest {
    String str = "4\n" +
            "10 20 Programozasi Nyelvek Java\n" +
            "150 190 Analizis\n" +
            "20 130 Analizis\n" +
            "55 78 Programozasi Nyelvek Java";

    String str2 = "6\n" +
            "67 78 Programozasi Nyelvek Java\n" +
            "10 20 Programozasi Nyelvek Java\n" +
            "150 190 Analizis\n" +
            "20 123 Analizis\n" +
            "55 66 Programozasi Nyelvek Java\n" +
            "124 130 Analizis\n";

    @Test
    public void noLine() throws StudyException {
        String tst = "0";
        Scanner sc = new Scanner(tst);

        StudyPlanner sp = new StudyPlanner();

        sp.readPagesFromText(sc);

        assertTrue("Valoban nulla", sp.getBookCount() == 0);
    }

    @Test
    public void exampleBookCount() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();

        sp.readPagesFromText(sc);

        assertTrue(String.valueOf(sp.getBookCount()), sp.getBookCount() == 2);
    }

    @Test
    public void examplePageCount_Analizis() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();

        sp.readPagesFromText(sc);
        assertTrue(sp.pageCountOf("Analizis").equals(152));
    }

    @Test
    public void examplePageCount_Java() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();

        sp.readPagesFromText(sc);
        assertTrue(sp.pageCountOf("Programozasi Nyelvek Java").equals(35));
    }

    @Test(expected = StudyException.class)
    public void missingBook() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();

        sp.readPagesFromText(sc);
        sp.pageCountOf("MissingBook");
        assertTrue(false);
    }

    @Test
    public void examplePageCountStrict_Analizis() throws StudyException {
        Scanner sc = new Scanner(str);
        StrictStudyPlanner sp = new StrictStudyPlanner();

        sp.readPagesFromText(sc);
        assertTrue(String.valueOf(sp.pageCountOf("Analizis")), sp.pageCountOf("Analizis").equals(170));
    }

    @Test
    public void isStudiedFalse() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(sc);

        assertFalse(sp.isStudied("Analizis", 141, 149));
    }

    @Test
    public void isStudiedStrict() throws StudyException {
        Scanner sc = new Scanner(str);
        StrictStudyPlanner sp = new StrictStudyPlanner();
        sp.readPagesFromText(sc);

        assertTrue(sp.isStudied("Analizis", 141, 149));
    }

    @Test
    public void studyDifferently() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(sc);

        Scanner sc2 = new Scanner(str2);
        StrictStudyPlanner sp2 = new StrictStudyPlanner();
        sp2.readPagesFromText(sc2);

        assertFalse(sp.equals(sp2));
    }

    @Test
    public void studyDifferently2() throws StudyException {
        Scanner sc = new Scanner(str);
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(sc);

        Scanner sc2 = new Scanner(str2);
        StudyPlanner sp2 = new StudyPlanner();
        sp2.readPagesFromText(sc2);

        assertTrue(sp.equals(sp2));
    }
}
