package refactoring;

import static org.junit.Assert.*;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	
	private Customer customer;

	@Before
	public void setUp() {
		customer = new Customer("Dario");
		Movie movie = new Movie("Gran Torino", Movie.REGULAR);
		Rental rental = new Rental(movie, 3);
		customer.addRental(rental);
	}

	@Test
	public void testStatement() {
		String rentalRecordString = customer.statement();
		assertTrue(rentalRecordString.contains("Rental Record for Dario"));
		assertTrue(rentalRecordString.contains("Gran Torino	3.5"));
		assertTrue(rentalRecordString.contains("Amount owed is 3.5"));
		assertTrue(rentalRecordString.contains("You earned 1 frequent renter points"));
	}

}
