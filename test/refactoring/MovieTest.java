package refactoring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {

	private Movie movie;

	@Before
	public void setUp() {
		movie = new Movie("Gran Torino", 666);
	}

	@Test
	public void testGetPriceCode() {
		assertEquals(666, movie.getPriceCode());
	}

	@Test
	public void testSetPriceCode() {
		assertEquals(666, movie.getPriceCode());
		movie.setPriceCode(777);
		assertEquals(777, movie.getPriceCode());
	}

	@Test
	public void testGetTitle() {
		assertEquals("Gran Torino", movie.getTitle());
	}

}
