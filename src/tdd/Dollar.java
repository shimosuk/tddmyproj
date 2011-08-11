package tdd;

public class Dollar extends Money {

	public Dollar(int amount,String currency) {
		this.amount = amount;
		this.currency = "USD";
	}

	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}



}
