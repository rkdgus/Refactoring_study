package kr.or.dgit.refactoring_study.price;

public class NewReleasePrice extends Price {
	public static final NewReleasePrice instance = new NewReleasePrice();
	
	
	private NewReleasePrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public MovieKind getPriceCode() {
		// TODO Auto-generated method stub
		return MovieKind.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += aDaysRented * 3;
		return result;
	}

	@Override
	public int getFrequenRenterPoints(int daysRented) {
		return daysRented > 1 ? 2:1;
	}

	
}
