public class Book {
	static enum Genre {
        FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
    }
	
	private final String author;
    private final String title;
    private final int reservePrice;
    private final int id;
    private final Genre genre;
	
	private static int lastId = 0;
	
	private Book(String author, String title, Genre genre, int reservePrice) {
		this.author = author;
        this.title = title;
        this.reservePrice = reservePrice;
        this.genre = genre;
		this.id = Book.lastId++;
	}
	
	public static void resetId() {
		lastId = 0;
	}
	
	public static Book make(String author,
							String title,
							int reservePrice,
							String genre) {
		try {
			if(null == author || null == title || author.length() < 2 || title.length() < 2) {
				return null;
			}
			Genre g = Genre.valueOf(genre);
			
			return new Book(author, title, g, reservePrice);
		} catch (IllegalArgumentException e) {
			return null;
		} 

	}
	
	public static Boolean isSameGenre(Book b1, Book b2) {
		return b1.genre == b2.genre;
	}
	
	public int compare(Book that) {
		if (!isSameGenre(this, that)) {
            throw new IllegalArgumentException("Not same genre");
        }
		return Integer.compare(reservePrice, that.reservePrice);
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getReservePrice() {
		return this.reservePrice;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Genre getGenre() {
		return genre;
	}
}
