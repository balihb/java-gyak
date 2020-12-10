class Book{
    private final String author, title;
    private final int pages;
    protected final static int defaultPages = 107;

    public String getAuthor() {
        return author;
    }

    public Book() {
        this(defaultPages);
    }

    public Book(int pages) {
        this("John Steinbeck", "Of Mice and Men", pages);
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

    @Override
    public String toString() {
        return author + ": " + title + ", pages: " + pages;
    }

    public String createReference(String article, int from, int to) {
        return getShortName() + " [" + from + "-" + to + "] referenced in article: " + article;
    }

    protected int getPages() {
        return pages;
    }
}
