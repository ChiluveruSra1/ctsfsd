package Assignment.two;

public class Fares {

	public static void main(String args[]) {
		Water ship=new Water(3145,9844);
		ship.calculateDistance();
		ship.calculateFuel();
		
		System.out.println();
		
		Road truck=new Road(3145,9844);
		truck.calculateDistance();
		truck.calculateFuel();
	}
}