package hibernateMappingOneToOne.ImageAlbum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	private static AlbumImageDAO dao;
	static {
		dao = new AlbumImageDAOImpl();
	}

	public static void main(String[] args) throws Exception {
		int choice = 0;
		Album album = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				System.out.println("======================\n1. create Album");
				System.out.println("2. find album by id");
				System.out.println("3. find album by last name");
				System.out.println("4. update album");
				System.out.println("5. delete album");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				String uId;
				switch (choice) {
				case 1:
					/*
					 * System.out.println("enter the no. of customers u want to add: "); int n =
					 * Integer.parseInt(br.readLine().toString()); for (int i = 0; i < n; i++) {
					 */
					System.out.print("Enter your name: ");
					String name = br.readLine().toString();
					Album a = new Album(name, LocalDate.now());

					Image tempImage = new Image("image1 url");
					a.setImage(tempImage);

					Album a1 = dao.createAlbum(a);
					System.out.println(a1);
					System.err.println("Album created");
					System.out.println("-------------------------------------------------------------\n");

					// }
					break;

				case 2:
					System.out.print("enter UID: ");
					uId = br.readLine().toString();
					System.out.println(dao.findbyId(uId));
					break;
				/*
				 * case 3: System.out.print("enter UID: "); uId = br.readLine().toString();
				 * System.out.println(dao.findbyId(uId)); break; case 4:
				 * System.out.print(" enter name: "); String rname = br.readLine().toString();
				 * System.out.println(dao.findByLname(rname)); break; case 5:
				 * System.out.print("enter UID: "); uId = br.readLine().toString();
				 * System.out.println(dao.updateCustomer(uId)); break; case 6:
				 * System.out.print("enter UID: "); uId = br.readLine().toString();
				 * System.out.println(dao.deleteCustomer(uId)); break;
				 */
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
