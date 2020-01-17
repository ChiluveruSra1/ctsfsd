package comm.customer.flightBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import lombok.ToString;

@ToString
public class BookingApp {

	private static BookingService service;
	static {
		service = new BookingServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
			int choice = 0;
			String uid,password,fid;
			int noofseats;
			List<FCustomer> clist = null;
			List<FlightBooking> flist =null;
			FCustomer fc = null;
			FlightBooking fb=null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				do {

					System.out.println("======================\n1. Booking flight");
					System.out.println("0. exit");
					System.out.print("choice: ");
					choice = Integer.parseInt(br.readLine().toString());
					switch (choice) {
					case 1:
						System.out.print("enter customer uid: ");
						uid = br.readLine().toString();			
						clist = service.findById(uid);
						if (clist.isEmpty()) {
							System.err.println("no such uid found\n\n");
							String arr[] = UUID.randomUUID().toString().split("-");
							System.out.print("your new uid: "+arr[1]);
							System.out.print("\ncreate password: ");
							password=br.readLine().toString();
							FCustomer theCustomer = new FCustomer(arr[1], password);
							//System.out.println(theCustomer);
							fc = service.createCustomer(theCustomer);
							System.out.println("Create Customer Sucess " + fc);	
						} else {
							System.out.println("found uid");
							System.out.print("enter password: ");
							String password1=br.readLine().toString();
							if(service.findByPassword(password1).isEmpty()) {
								System.out.println("worng password");
								System.exit(0);
							}
						}
						System.err.println("-----------------------------");
						
						flist=service.displayFlightBooking();
						System.err.format("%-20s %s\n", "Flight No", "No. of Seats");
						flist.forEach(c -> {
							System.out.format("%-20s %s\n", c.getFlightno(),c.getNoofseats());
						});
							
						System.out.println();
						System.out.print("Enter flight no: ");
						fid=br.readLine().toString();
						System.out.print("Enter no. of tickets: ");
						noofseats=Integer.parseInt(br.readLine().toString());
									
						fb =service.updateFlightBooking(fb,noofseats);
						System.out.println("Flight table updated: "+fb);
							
						System.out.println("Tickets booked successfully\n");
						break;
					case 0:
						System.exit(0);
						break;
					default:
						System.out.println("invalid choice");
						break;
					}

				} while (choice != 0);
			}catch(

	Exception e)
	{
		e.printStackTrace();
		System.exit(0);
	}

}}
