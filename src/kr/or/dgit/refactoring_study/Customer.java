package kr.or.dgit.refactoring_study;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록\n");

		for (Rental each : rentals) {
			double thisAmout = 0;

			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmout += 2;
				if (each.getDaysRented() > 2) {
					thisAmout += (each.getDaysRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:

				thisAmout += each.getDaysRented() * 3;

				break;
			case Movie.CHILDRENS:
				thisAmout += 1.5;
				if (each.getDaysRented() > 3) {
					thisAmout += (each.getDaysRented() - 3) * 1.5;
				}
				break;
			}
			frequentRenterPoints++;

			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) 
				frequentRenterPoints++;

				result.append("\t" + each.getMovie().getTitle());
				result.append("\t" + String.valueOf(thisAmout) + "\n");

				totalAmount += thisAmout;
			

		}
		result.append("누적 대여료 : " + String.valueOf(totalAmount) + "\n");
		result.append("적립 포인트 : " + String.valueOf(frequentRenterPoints));
		return result.toString();
	}
}
