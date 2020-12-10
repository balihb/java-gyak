package study.planner;

import java.util.Set;
import java.util.TreeSet;

public class StrictStudyPlanner extends StudyPlanner {
    @Override
    protected Set<Integer> getEmptySet() {
        return new TreeSet<>();
    }

    @Override
    public Integer pageCountOf(String bookName) throws StudyException {
        TreeSet<Integer> pc = (TreeSet<Integer>) bookToPages.get(bookName);
        if(pc != null) {
            Integer ceiling = pc.ceiling(Integer.MIN_VALUE);
            Integer floor = pc.floor(Integer.MAX_VALUE);

            return floor - ceiling;
        } else {
            throw new StudyException("Book " + bookName + " is unknown");
        }
    }

    @Override
    public boolean isStudied(String bookName, int page) {
        TreeSet<Integer> pc = (TreeSet<Integer>) bookToPages.get(bookName);
        if(pc != null) {
            Integer ceiling = pc.ceiling(Integer.MIN_VALUE);
            Integer floor = pc.floor(Integer.MAX_VALUE);

            return (floor >= page && ceiling <= page);
        } else {
            return false;
        }
    }

    @Override
    public boolean isStudied(String bookName, int fromPage, int toPage) {
        TreeSet<Integer> pages = (TreeSet<Integer>) bookToPages.get(bookName);
        if (pages != null) {
            Integer ceiling = pages.ceiling(Integer.MIN_VALUE);
            Integer floor = pages.floor(Integer.MAX_VALUE);
            for (int i = fromPage; i <= toPage; i++) {
                if(floor >= i && ceiling <= i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
