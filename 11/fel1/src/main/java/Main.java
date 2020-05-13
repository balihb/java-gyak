class Main {
    public static boolean isSameAuthor(Book book1, Book book2) {
        return book1.getAuthor().equals(book2.getAuthor());
    }

    public static void main(String[] args) {
        System.out.println();

        PrintedBook pbook1 = new PrintedBook();
        System.out.println(pbook1.getShortName());
        System.out.println(" price = " + pbook1.getPrice());
        PrintedBook pbook2 = new PrintedBook("author", "Printed: Title", 100, CoverType.Softcover);
        System.out.println(pbook2.getShortName());
        System.out.println(" price = " + pbook2.getPrice());

        System.out.println();

        EBook ebook1 = new EBook("author2", "Digitalised: Title", 100, 12);
        System.out.println(ebook1.getShortName());
        System.out.println(" price = " + ebook1.getPrice());

        System.out.println();

        System.out.println(pbook1);
        System.out.println(pbook2);
        System.out.println(ebook1);

        System.out.println();

        //Book book3 = new PrintedBook();
        //System.out.println("book3 price: " + book3.getPrice()); // compile error

        System.out.println(pbook1.createReference("articlename", 10, 20));
        System.out.println(ebook1.createReference("articlename", "2020/04/11"));
        System.out.println(ebook1.createReference("articlename", 10, 20));

        System.out.println();
    }
}

