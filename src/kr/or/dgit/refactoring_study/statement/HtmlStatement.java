package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class HtmlStatement extends Statement {
	public static final HtmlStatement instance = new HtmlStatement();
	
	
	
	private HtmlStatement() {}

	public String headerString(String cusomerName) {
		return String.format("<h1><em>%s 고객님의 대여 기록</em></h1><p>%n", cusomerName);
	}

	public String eachRentalString(Rental aEach) {
		return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	public String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <em>%s</em>%n<p>적립 포인트 : <em>%s</em><p>", aCustomer.getTotalCharge(),
				aCustomer.getTotalFrequentRenterPoints());
	}
}
