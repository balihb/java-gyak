public abstract class Book {
    private String author;
    private String title;
    protected int pageNumber;

    public Book(String author, String title, int pageNumber) throws IllegalArgumentException {
        if(author.length() < 2 || title.length() < 4)
            throw new IllegalArgumentException("Title or Author too short");
        this.author = author;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public Book() {
        this("John Steinbeck", "Of Mice and Men", 107);
    }

    public String getShortName() {
        return String.format("%s%s",author.substring(0,2),title.substring(0,4));
    }

    public String getShortName2() {
        return String.format("%s%s2",author.substring(0,2),title.substring(0,4));
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }

    public abstract int getPrice();

    public int getPages() {
        return pageNumber;
    }
}
