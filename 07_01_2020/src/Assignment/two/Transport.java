package Assignment.two;

public abstract class Transport {
	private int intialKM;
	private int finalKM;
	
	public int getIntialKM() {
		return intialKM;
	}
	public void setIntialKM(int intialKM) {
		this.intialKM = intialKM;
	}
	public int getFinalKM() {
		return finalKM;
	}
	public void setFinalKM(int finalKM) {
		this.finalKM = finalKM;
	}
	
	public abstract void calculateDistance();
	public abstract void calculateFuel();	
}
