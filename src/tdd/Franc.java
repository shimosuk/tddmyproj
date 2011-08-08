package tdd;

/** 6Í@Money */

public class Franc extends Money{
	
	public Franc(int amount)  {
		this.amount=amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object){
		Money franc = (Money) object;
		return amount == franc.amount;
	}

}
