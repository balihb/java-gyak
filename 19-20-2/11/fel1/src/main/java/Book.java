abstract class Book {
    private String author, title;
    protected int pages;
    int price;

    public String getAuthor() {
        return author;
    }

    public Book() {
        this.author = "John Steinbeck";
        this.title = "Of Mice and Men";
        this.pages = 107;
    }

    public Book(String author, String title, int pages) {
        if (author.length() < 2 || title.length() < 4) {
            throw new IllegalArgumentException();
        }

        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getShortName() {
        return author.substring(0, 1) + ": " + title.substring(0, 3) + "; " + pages;
    }

    //@Override
    public String toString() {
        return author + ": " + title + ", pages: " + pages;
    }

    public abstract String createReference(String article, int from, int to);

    public abstract int getPrice();
}
