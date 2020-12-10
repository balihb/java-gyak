package study.planner;

import java.util.*;

public class StudyPlanner implements Comparable<StudyPlanner> {
    protected Map<String, Set<Integer>> bookToPages = new HashMap<>();

    protected Set<Integer> getEmptySet() {
        return new HashSet<>();
    }

    public void readPagesFromText(Scanner sc) throws StudyException {
        int lineCount = Integer.parseInt(sc.nextLine());

        System.out.println("linec: " + lineCount);

        for (int i = 0; i < lineCount; i++) {
            String line = sc.nextLine();
            System.out.println("line: " + line);

            String[] split = line.split(" ", 3);

            if (split.length > 3)
                throw new IllegalArgumentException("Data for book " + line + " is wrong");

            int from = Integer.parseInt(split[0]);
            int to = Integer.parseInt(split[1]);
            String bookName = joinTexts(2, split);

            Set<Integer> lineElems = bookToPages.get(bookName);
            if (lineElems == null)
                lineElems = getEmptySet();

            for (int j = from; j <= to; j++) {
                if (lineElems.contains(j))
                    throw new StudyException("Book " + bookName + " already contains page " + j);
                lineElems.add(j);
            }

            bookToPages.put(bookName, lineElems);
        }
    }


    private String joinTexts(int idx, String[] split) {
        StringBuilder retVal = new StringBuilder();
        retVal.append(split[2]);
        for (int i = 3; i < split.length; i++) {
            retVal.append(split[i]);
        }
        return retVal.toString();
    }

    public int getBookCount() {
        return bookToPages.size();
    }

   public Integer pageCountOf(String bookName) throws StudyException {
        Set<Integer> pc = bookToPages.get(bookName);
        if(pc != null) {
            return pc.size();
        } else {
            throw new StudyException("Book " + bookName + " is unknown");
        }
   }

   public boolean isStudied(String bookName, int page) {
        Set<Integer> pages = bookToPages.get(bookName);
        return pages.contains(page);
   }

   public boolean isStudied(String bookName, int fromPage, int toPage) {
       Set<Integer> pages = bookToPages.get(bookName);
        for (int i = fromPage; i <= toPage; i++){
            if(pages.contains(i)) {
                return true;
            }
        }
        return false;
   }

   private Integer getPageCount() {
        Integer pages = 0;
        for( String key : bookToPages.keySet() ) {
            try {
                pages += pageCountOf(key);
            } catch (StudyException se) {

            }
        }
        return pages;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ! (o instanceof StudyPlanner)) return false;
        StudyPlanner that = (StudyPlanner) o;
        return (bookToPages.equals(that.bookToPages) && getPageCount().equals(((StudyPlanner) o).getPageCount()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookToPages);
    }

    @Override
    public int compareTo(StudyPlanner o) {
        Integer pc = getPageCount();
        Integer otherPc = o.getPageCount();
        if(pc > otherPc) return 1;
        if(pc < otherPc) return -1;
        return 0;
    }
}
