package Assignment.two;

public class Road extends Transport {
	
	private int dt;
	private final static int MILEAGE=11;

	public Road(int intialKM, int finalKM) {
		super();
		setIntialKM(intialKM);
		setFinalKM(finalKM);
	}

	@Override
	public void calculateDistance() {
		dt=getFinalKM()-getIntialKM();
		System.out.println("Inital Km: "+getIntialKM()+"     Final Km: "+getFinalKM());
	}

	@Override
	public void calculateFuel() {
		System.out.println("Mileage: "+MILEAGE+"km/l");
		int fuelConsumption=dt/MILEAGE;
		int fuelLeft=1000-fuelConsumption;
		System.out.println("Fuel Consumption for "+dt+"km is: "+fuelConsumption+"ltrs");
		if(fuelConsumption>=1000) {
			System.out.println("Refuel; Exceeded by "+-(fuelLeft)+"ltrs");
		}
		else {
		System.out.println("Fuel Left is: "+fuelLeft);
		System.out.println("You can travel more: "+(fuelLeft/MILEAGE)+"km");
	}}
	
}
