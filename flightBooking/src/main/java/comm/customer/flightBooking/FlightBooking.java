package comm.customer.flightBooking;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter

public class FlightBooking implements Serializable {

	private static final long serialVersionUID = -8710723736744423082L;
	private String flightno;
	private int noofseats;
	public FlightBooking(String flightno, int noofseats) {
		super();
		this.flightno = flightno;
		this.noofseats = noofseats;
	}
	@Override
	public String toString() {
		return "FlightBooking [flightno=" + flightno + ", noofseats=" + noofseats + "]";
	}
	
	

}
