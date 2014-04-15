package refactoring;

public class NewReleasePrice extends Price {

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}
