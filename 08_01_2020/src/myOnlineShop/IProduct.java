package myOnlineShop;

public interface IProduct {
	
	public double computeSalesPrice();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] p=new Product[5];
		
		p[0]=new TV(1.00,"apple",25);
		p[1]=new Books(35.00, "APJ", 2004);
		
		
	System.out.println(p[0].computeSalesPrice());
	System.out.println(p[1].computeSalesPrice());

	double totalPrice=0;
	for(Product i:p) {
		totalPrice+=i.getRegularPrice();
		System.out.println("Product Type: "+i.getClass().getName()+"   Price: "+i.computeSalePrice());
	}
	System.out.println("Total Price: "+totalPrice);

}

}
