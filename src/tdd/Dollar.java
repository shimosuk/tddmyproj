package tdd;

/** 2�́@�I�u�W�F�N�g */
/////////////////////////
public class Dollar {

	public int amount;
	
	public Dollar(int amount)  {
		this.amount=amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

}
