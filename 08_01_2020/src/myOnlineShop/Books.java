package myOnlineShop;

public class Books extends Product {
    
    private String publisher;
    private int yearPublished;
    
    public Books(double regularPrice,
            String publisher,
            int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return getRegularPrice();
	}
    

}
