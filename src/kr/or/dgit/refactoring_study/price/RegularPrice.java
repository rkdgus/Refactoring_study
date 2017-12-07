package kr.or.dgit.refactoring_study.price;

public class RegularPrice extends Price {
	public static final RegularPrice instance = new RegularPrice();
	
	
	private RegularPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public MovieKind getPriceCode() {
		// TODO Auto-generated method stub
		return MovieKind.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 1.5;
		if (aDaysRented > 3) {
			result += (aDaysRented - 3) * 1.5;
		}
		return result;
	}
}
