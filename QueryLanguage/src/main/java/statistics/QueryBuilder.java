package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

public class QueryBuilder {

	Matcher matcher;
	
	public QueryBuilder() {
		this.matcher = new And();
	}
	
	QueryBuilder playsIn(String team) {
		matcher = new And(matcher, new PlaysIn(team));
		return this;
	}
	
	QueryBuilder hasAtLeast(int value, String field) {
		matcher = new And(matcher, new HasAtLeast(value, field));
		return this;
	}
	
	QueryBuilder hasFewerThan(int value, String field) {
		matcher = new And(matcher, new HasFewerThan(value, field));
		return this;
	}
	
	QueryBuilder oneOf(Matcher... matchers) {
		matcher = null;
		matcher = new Or(matchers);
		return this;
	}
	
	public Matcher build() {
		Matcher matcherCopy = matcher;
		matcher = new And();
		return matcherCopy;
	}
	
}
