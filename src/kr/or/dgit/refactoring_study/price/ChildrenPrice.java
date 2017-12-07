package kr.or.dgit.refactoring_study.price;

public class ChildrenPrice extends Price {
	public static final ChildrenPrice instance = new ChildrenPrice();
	
	
	private ChildrenPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public MovieKind getPriceCode() {
		// TODO Auto-generated method stub
		return MovieKind.CHILDRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 2;
		if (aDaysRented > 2) {
			result += (aDaysRented - 2) * 1.5;
		}
		return result;
	}

}
