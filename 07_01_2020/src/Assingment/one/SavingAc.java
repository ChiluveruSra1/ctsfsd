package Assingment.one;

public class SavingAc extends Account {
	
	Float rateOfIntrest;
	Double amount;
	public SavingAc() {
		super();
	}
	public SavingAc(Float rateOfIntrest, Double amount) {
		super();
		this.rateOfIntrest = rateOfIntrest;
		this.amount = amount;
	}
	@Override
	public String toString() {
		System.out.println("-----------------------------------------------------------------------");
		return "\nSavingAc [rateOfIntrest=" + rateOfIntrest + ", amount=" + amount + "]";
	}
		

}
