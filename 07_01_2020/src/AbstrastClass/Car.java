package AbstrastClass;

public abstract class Car {
	private double carPrice;
	private String carColor, model;
	
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Car [carPrice=" + carPrice + ", carColor=" + carColor + ", model=" + model + "]";
	}
	
	
	
	
}
