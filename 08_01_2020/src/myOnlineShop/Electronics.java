package myOnlineShop;

public class Electronics extends Product implements IElectronics{


	private String mangfr;
	
	public Electronics(double regularPrice, String mangfr) {
		super(regularPrice);
		this.mangfr = mangfr;
	}

	@Override
	public double computeSalesPrice() {
		return 0;
	}
	
	public String getMangfr() {
		return mangfr;
	}

	public void setMangfr(String mangfr) {
		this.mangfr = mangfr;
	}
	


}
