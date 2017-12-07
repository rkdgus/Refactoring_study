package kr.or.dgit.refactoring_study.price;

public class ActionPrice extends Price {
	public static final ActionPrice instance = new ActionPrice();
	
	
	private ActionPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public MovieKind getPriceCode() {
		// TODO Auto-generated method stub
		return MovieKind.ACTION;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 4;
		if (aDaysRented > 2) {
			result += (aDaysRented - 2) * 2;
		}
		return result;
	}

}
