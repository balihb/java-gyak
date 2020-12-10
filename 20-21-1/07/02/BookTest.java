import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class BookTest {
	private Book bOne;
	
	@Before
	public void setUp() {
		Book.resetId();
		bOne = Book.make("abc", "def1", 10000, "EDUCATIONAL");
	}
	
	@After
	public void tearDown() {
		Book.resetId();
		bOne = null;
	}
	
	@Test
	public void testMake() {
		String author = "Bestauthor Guy";
		String title = "The Best Book Ever";
		int resPrice = 1000;
		String genre = "FANTASY";
		Book b = Book.make(author, title, resPrice, genre);
		
		assertEquals("Author", author, b.getAuthor());
		assertEquals("Title", title, b.getTitle());
		assertTrue("resPrice", resPrice == b.getReservePrice());
		assertEquals("resPrice int", resPrice, b.getReservePrice(), 0.01);
		assertEquals("Genre", genre, b.getGenre().toString());
	}
	
	@Test
	public void testMakeTwoBook() {
		String author = "Bestauthor Guy";
		String title = "The Best Book Ever";
		int resPrice = 1000;
		String genre = "FANTASY";
		Book b1 = Book.make(author, title, resPrice, genre);
		Book b2 = Book.make(author, title, resPrice, genre);
		
		assertEquals("Author", b1.getAuthor(), b2.getAuthor());
		assertEquals("Title", b1.getTitle(), b2.getTitle());
		assertTrue("resPrice", b1.getReservePrice() == b2.getReservePrice());
		assertEquals("resPrice int", b1.getReservePrice(), b2.getReservePrice(), 0.01);
		assertEquals("Genre", b1.getGenre(), b2.getGenre());
	}
	
	@Test
	public void testMakeTwoBookDiffId() {
		String author = "Bestauthor Guy";
		String title = "The Best Book Ever";
		int resPrice = 1000;
		String genre = "FANTASY";
		Book b1 = Book.make(author, title, resPrice, genre);
		Book b2 = Book.make(author, title, resPrice, genre);

		assertTrue("Defferent ID", b1.getId() != b2.getId());
	}
	
	@Test
	public void testMakeThreeBookDiffId() {
		String author = "Bestauthor Guy";
		String title = "The Best Book Ever";
		int resPrice = 1000;
		String genre = "FANTASY";
		Book b1 = Book.make(author, title, resPrice, genre);
		Book b2 = Book.make(author, title, resPrice, genre);
		Book b3 = Book.make(author, title, resPrice, genre);

		assertTrue("Defferent ID",
			(b1.getId() != b2.getId()) &&
			(b2.getId() != b3.getId()) &&
			(b1.getId() != b3.getId())
		);
	}
	
	@Test
    public void compare_isSameGenre() {
        Book b1 = Book.make("abc", "def1", 10000, "SCIFI");
        Book b3 = Book.make("abc", "def3", 7777, "EDUCATIONAL");
        assertFalse("Not same", Book.isSameGenre(b1, bOne));
        assertTrue("Same", Book.isSameGenre(bOne, b3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void compare_NotSameGenre() {
        Book b1 = Book.make("abc", "def", 10000, "SCIFI");
        Book b2 = Book.make("abc", "def", 10000, "EDUCATIONAL");
        b1.compare(b2);
    }
	
	@Test
	public void compare() {
		Book b1 = Book.make("abc", "def1", 10000, "EDUCATIONAL");
        Book b3 = Book.make("abc", "def3", 7777, "EDUCATIONAL");
		assertTrue("Greater", b1.compare(b3) == 1);
		assertTrue("Lesser", b3.compare(b1) == -1);
		assertTrue("Equal", bOne.compare(b1) == 0);
	}
}
