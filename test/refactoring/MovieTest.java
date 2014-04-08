package refactoring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {
	
	private Movie movie;
	
	@Before
	public void setUp(){
		movie = new Movie("Gran Torino", 666);
	}

	@Test
	public void testGetPriceCode() {
		assertEquals(666,movie.getPriceCode());
	}

	@Test
	public void testSetPriceCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTitle() {
		fail("Not yet implemented");
	}

}
