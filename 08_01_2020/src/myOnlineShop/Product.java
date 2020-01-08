package myOnlineShop;

public class Product implements IProduct {
	private double regularPrice;
	
	public Product(double regularPrice) {
		super();
		this.regularPrice = regularPrice;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	
	public double computeSalePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}