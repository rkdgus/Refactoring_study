package kr.or.dgit.refactoring_study;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring_study.statement.StatementFactory;
import kr.or.dgit.refactoring_study.statement.StatementKind;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public String statement(StatementKind isText) {
		return StatementFactory.getStatement(isText).value(this);

	}

	public int getTotalFrequentRenterPoints() {
		int result = 0;
		for(Rental rental : rentals) {
			result += rental.getFrequenRenterPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

