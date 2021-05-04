public class PrintedBook extends Book {
    private PrintedBookCoverType coverType;

    public PrintedBook() {
        this.coverType = PrintedBookCoverType.Hardcover;
    }

    public PrintedBook(String author, String title, int pageNumber, PrintedBookCoverType coverType) throws IllegalArgumentException {
        super(author, title, pageNumber);
        this.coverType = coverType;
    }

    @Override
    public String getShortName() {
        return String.format("%s%s", super.getShortName2(), coverType.toString());
    }

    public String printedBookSpecific() {
        return "yes it is";
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                super.toString() +
                ", coverType=" + coverType +
                '}';
    }

    public int getPrice() {
        if (coverType == PrintedBookCoverType.Hardcover) {
            return pageNumber * 3;
        }
        return pageNumber * 2;
    }
/*    public String getShortName2() {
        return String.format("%s3",super.getShortName2());
    }*/
}
