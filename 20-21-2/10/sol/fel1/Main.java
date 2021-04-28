

import java.io.File;
import java.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

class Book
{
    private String author, title;
    protected int pages;

    public String getAuthor() { return author; }

    public Book()
    {
        this.author = "John Steinbeck";
        this.title = "Of Mice and Men";
        this.pages = 107;
    }

    public Book(String author, String title, int pages)
    {
        if (author.length() < 2 || title.length() < 4)
        {
            throw new IllegalArgumentException();
        }

        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public int getPages()
    {
        return pages;
    }

    public String getShortName()
    {
        return author.substring(0, 2) + ": " + title.substring(0, 4) + "; " + pages;
    }

    //@Override
    public String toString()
    {
        return author + ": " + title + ", pages: " + pages;
    }

    public String createReference(String article, int from, int to)
    {
        return getShortName() + " [" + from + "-" + to + "] referenced in article: " + article;
    }
}

enum CoverType
{
    Softcover,
    Hardcover;
}

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

class EBook extends Book
{
    protected int PDFSize;

    public EBook(String author, String title, int pages, int PDFSize)
    {
        super(author, title, pages);
        this.PDFSize = PDFSize;
    }

    public int getPrice()
    {
        return pages + PDFSize;
    }

    @Override
    public String createReference(String article, int from, int to)
    {
        return super.toString() + " (PDF size: " + PDFSize + ") [" + from + "-" + to + "] referenced in article: " + article;
    }

    //@Override // compile error
    public String createReference(String article, String date)
    {
        return super.toString() + " (PDF size: " + PDFSize + ") referenced in article: " + article + ", accessing PDF date: " + date;
    }
}

class Article
{
    private String title, body, conclusion;
    private PrintWriter pw;
    private ArrayList<Book> refs;

    public Article(String title, String body, String conclusion)
    {
        this.title = title;
        this.body = body;
        this.conclusion = conclusion;
        this.refs = new ArrayList<Book>();
    }

    public void addBookToReferences(Book book)
    {
        refs.add(book);
    }

    private void printReference(Book book, int from, int to)
    {
        String ref = book.createReference(this.title, from, to);
        // Book, PrintedBook and EBook have a proper createReference() method, that takes care of proper reference creation.
        // Note here the caller doesn't even interested in if book is a Book, PrintedBook or EBook, just the fact that every Book have a createReference() method.
        // Easy to add new kind of Book-s, we just have to take care to define a proper createReference() method.

        // The imperative solution (without method overriding and LSP) would be to check here what the exact type of book,
        // which would result in many if-conditions in the source code, which is not the dream of a programmer.

        pw.print(ref);
        pw.print(System.lineSeparator());
    }

    public void print(String destfilename)
    {
        try
        {
            pw = new PrintWriter(new File(destfilename));

            pw.print(title);
            pw.print(System.lineSeparator());
            pw.print(body);
            pw.print(System.lineSeparator());
            pw.print(conclusion);
            pw.print(System.lineSeparator());

            for (Book book : refs)
            {
                printReference(book, 1, book.getPages()); // LSP
            }
        }
        catch (IOException exc)
        {
            System.out.println(exc.getStackTrace());
        }
        finally
        {
            pw.close();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        PrintedBook pbook1 = new PrintedBook();
        EBook ebook1 = new EBook("author2", "Digitalised: Title", 100, 12);

        System.out.println(book1);
        System.out.println(pbook1);
        System.out.println(ebook1);

        System.out.println();

        System.out.println(book1.createReference("articlename", 10, 20));
        System.out.println(pbook1.createReference("articlename", 10, 20));
        System.out.println(ebook1.createReference("articlename", 10, 20));

        Article myArticle = new Article("My fictional article", "foo_body", "foo_conclusion");
        myArticle.addBookToReferences(book1); // LSP
        myArticle.addBookToReferences(pbook1); // LSP
        myArticle.addBookToReferences(ebook1); // LSP
        myArticle.print("out.txt");
    }
}

