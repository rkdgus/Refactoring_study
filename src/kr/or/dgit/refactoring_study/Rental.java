package kr.or.dgit.refactoring_study;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
	
	public double getCharge() {
		return this.movie.getCharge(daysRented);
	}
	
	public int getFrequenRenterPoints() {
			return movie.getFrequenRenterPoints(daysRented);
	}

}
