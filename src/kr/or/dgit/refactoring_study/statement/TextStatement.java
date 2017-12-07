package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class TextStatement extends Statement {
	public static final TextStatement instance = new TextStatement();
	
	
	private TextStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String headerString(String cusomerName) {
		return String.format("%s 고객님의 대여 기록%n", cusomerName);
	}

	public String eachRentalString(Rental aEach) {
		return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	public String footerString(Customer aCustomer) {
		return String.format("누적 대여료 : %s%n적립 포인트 : %s", aCustomer.getTotalCharge(),
				aCustomer.getTotalFrequentRenterPoints());
	}
}
