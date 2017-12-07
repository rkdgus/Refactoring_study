package kr.or.dgit.refactoring_study.price;

public class PriceFactory {

	public static Price getFactory(MovieKind priceCode) {
		Price price = null;
		switch(priceCode) {
		case REGULAR:
			price = RegularPrice.instance;
			break;
		case CHILDRENS:
			price =  ChildrenPrice.instance;
			break;
		case NEW_RELEASE:
			price = NewReleasePrice.instance;
			break;
		case ACTION:
			price =  ActionPrice.instance;
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못되었습니다.");
		}
		return price;
	}

}
