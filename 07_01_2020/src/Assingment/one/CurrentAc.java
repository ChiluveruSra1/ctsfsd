package Assingment.one;

public class CurrentAc extends Account {

	Boolean isEligible;
	Double amount;
	public CurrentAc() {
		super();
	}
	
	public CurrentAc(Integer acId, String name, String add, Double amount) {
		super(acId, name, add);
		this.amount=amount;
	}
	
	

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		System.out.println("-----------------------------------------------------------------------");
		if(amount>=50000) {
			isEligible=true;
		}
		else {
			isEligible=false;
		}
		return "\nCurrentAc [isEligible=" + isEligible + ", amount=" + amount + ", acId=" + acId + ", name=" + name
				+ ", add=" + add +"]";

	}
	
	public static void main(String args[]) {
		CurrentAc ca=new CurrentAc(10, "Sra1", "White Field", (double) 60000);
		Account account=new CurrentAc(10, "Sra1", "White Field", (double) 40000);
		SavingAc sa=new SavingAc(1.5F, 18010.00);
		Account a1=new Account(10, "Sra1", "White Field");
		
		System.out.println(ca.toString());

		System.out.println(sa.toString());

		System.out.println(a1.toString());

		System.out.println(account.toString());
		
		System.out.println("\n\n"+a1.equals(ca));
		
				
	}
	


	


}
