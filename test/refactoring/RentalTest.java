package refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RentalTest {

	@Test
	public void testGetCharge() {
		assertEquals(2, getChargeForMovie(Movie.REGULAR, 2), 0.01);
		assertEquals(3.5, getChargeForMovie(Movie.REGULAR, 3), 0.01);
		assertEquals(5, getChargeForMovie(Movie.REGULAR, 4), 0.01);
		assertEquals(6.5, getChargeForMovie(Movie.REGULAR, 5), 0.01);
		assertEquals(9, getChargeForMovie(Movie.NEW_RELEASE, 3), 0.01);
		assertEquals(12, getChargeForMovie(Movie.NEW_RELEASE, 4), 0.01);
		assertEquals(15, getChargeForMovie(Movie.NEW_RELEASE, 5), 0.01);
		assertEquals(1.5, getChargeForMovie(Movie.CHILDRENS, 3), 0.01);
		assertEquals(3, getChargeForMovie(Movie.CHILDRENS, 4), 0.01);
		assertEquals(4.5, getChargeForMovie(Movie.CHILDRENS, 5), 0.01);

	}

	private double getChargeForMovie(int type, int days) {
		return new Rental(new Movie("", type), days).getCharge();
	}
}
