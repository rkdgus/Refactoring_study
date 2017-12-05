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
			frequentRenterPoints += each.getFrequenRenterPoints();
			
			result.append("\t" + each.getMovie().getTitle());
			result.append("\t" + String.valueOf(each.getCharge()) + "\n");

			totalAmount += each.getCharge();
		}
		result.append("누적 대여료 : " + String.valueOf(totalAmount) + "\n");
		result.append("적립 포인트 : " + String.valueOf(frequentRenterPoints));
		
		return result.toString();
	}

}
