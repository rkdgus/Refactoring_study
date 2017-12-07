package kr.or.dgit.refactoring_study.statement;

public class StatementFactory {

	public static Statement getStatement(StatementKind isText) {
		Statement stmt = null;
		switch (isText) {
		case TEXT:
			stmt = TextStatement.instance;
			break;
		case HTML:
			stmt = HtmlStatement.instance;
			break;
		case XML:
			stmt = XmlStatement.instance;
			break;
		default:
			throw new IllegalArgumentException("출력코드가 잘못되었습니다.");
		}
		return stmt;
	}

}
