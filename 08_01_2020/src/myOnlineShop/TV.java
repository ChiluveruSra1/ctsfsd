package myOnlineShop;

public class TV extends Electronics{
	
	private int size;

	public TV(double regularPrice, String mangfr, int size) {
		super(regularPrice, mangfr);
		this.setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String getMangfr() {
		// TODO Auto-generated method stub
		return super.getMangfr();
	}

	@Override
	public void setMangfr(String mangfr) {
		// TODO Auto-generated method stub
		super.setMangfr(mangfr);
	}
	
	
	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		if(size>1&&size<=15) 
			setRegularPrice(10000.00);
			else if(size>15 && size<=30)
				setRegularPrice(25000);
			else if(size>30)
				setRegularPrice(40000);
			else
				setRegularPrice(0);
				
		return getRegularPrice();
	}

}



