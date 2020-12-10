class EBook extends Book {
    protected int PDFSize;

    public EBook(String author, String title, int pages, int PDFSize) {
        super(author, title, pages);
        this.PDFSize = PDFSize;
    }

    public int getPrice() {
        return getPages() + PDFSize;
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + " (PDF size: " + PDFSize + ") [" + from + "-" + to + "] referenced in article: " + article;
    }

    //@Override // compile error
    public String createReference(String article, String date) {
        return super.toString() + " (PDF size: " + PDFSize + ") referenced in article: " + article + ", accessing PDF date: " + date;
    }
}
