package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class XmlStatement extends Statement {
	public static final XmlStatement instance = new XmlStatement();
	
	

	private XmlStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String headerString(String cusomerName) {
		return String.format("<customer>%n\t<고객명>%s</고객명>%n", cusomerName);
	}

	public String eachRentalString(Rental aEach) {
		return String.format("\t<Movie>%s</Movie>\t<price>%s</price>%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	public String footerString(Customer aCustomer) {
		return String.format("\t<누적 대여료>%s</누적 대여료>%n<적립 포인트>%s</적립 포인트>%n</customer>", aCustomer.getTotalCharge(),
				aCustomer.getTotalFrequentRenterPoints());
	}

}
