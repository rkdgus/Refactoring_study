package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.MovieKind;
import kr.or.dgit.refactoring_study.price.Price;
import kr.or.dgit.refactoring_study.price.PriceFactory;

public class Movie {


	private String title;
	private Price price;

	public Movie(String title, MovieKind priceCode) {
		super();
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MovieKind getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(MovieKind priceCode) {
		price = PriceFactory.getFactory(priceCode);
	}
	
	public double getCharge(int aDaysRented) {
		
		return price.getCharge(aDaysRented);
	}
	
	public int getFrequenRenterPoints(int daysRented) {
		
			return price.getFrequenRenterPoints(daysRented);
	}
}
