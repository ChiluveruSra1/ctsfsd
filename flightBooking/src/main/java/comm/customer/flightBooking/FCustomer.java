package comm.customer.flightBooking;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class FCustomer implements Serializable {
	
	private static final long serialVersionUID = 8822142042502434567L;
	private String uId;
	private String password;
	
	public FCustomer(String uId, String password) {
		super();
		this.uId = uId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [uid=" + uId + ", password=" + password + "]";
	}
	
}
