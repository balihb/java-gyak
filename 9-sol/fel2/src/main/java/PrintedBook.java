class PrintedBook extends Book
{
    protected CoverType cover;

    public PrintedBook()
    {
        this.pages += 6;
        this.cover = CoverType.Hardcover;
    }

    public PrintedBook(String author, String title, int pages, CoverType cover)
    {
        super(author, title, pages + 6);
        this.cover = cover;
    }

    public int getPrice()
    {
        if (cover == CoverType.Softcover)
        {
            return pages * 2;
        }
        else
        {
            return pages * 3;
        }
    }

    //@Override
    public String toString()
    {
        if (cover == CoverType.Softcover)
        {
            return super.toString() + " (softcover)";
        }
        else
        {
            return super.toString() + " (hardcover)";
        }
    }

    @Override
    public String createReference(String article, int from, int to)
    {
        return super.toString() + " [" + from + "-" + to + "] referenced in article: " + article;
    }
}
