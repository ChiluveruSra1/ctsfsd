package hibernateMappingOneToOne.TodoTaskOneToOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	private static ToDoDAO dao;
	static {
		dao = new ToDoDAOImpl();
	}

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Todo.class)
				.addAnnotatedClass(Task.class).buildSessionFactory();
		Session session = factory.openSession();

		int choice = 0;
		Todo td = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {

				System.out.println("=========================\n1. create todo");
				System.out.println("2. display all todo");
				System.out.println("3. find todo");
				System.out.println("4. Update todo");
				System.out.println("5. Remove todo");
				System.out.println("6. Remove All todo's");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				String uId;
				switch (choice) {
				case 1:
					/*
					 * System.out.println("enter the no. of todo's u want to add: "); int n =
					 * Integer.parseInt(br.readLine().toString()); for (int i = 0; i < n; i++) {
					 */
					System.out.print("Enter todo name: ");
					String name = br.readLine().toString();

					System.out.print("Enter task name: ");
					String taskName = br.readLine().toString();

					Todo td1 = dao.crtToDo(name, taskName);

					session.getTransaction().begin();
					session.save(td1);
					session.getTransaction().commit();

					System.out.println(td1);
					System.err.println("Created Todo & Task");
					System.out.println("-----------------------------------------------------------\n");

					// }
					break;

				case 2:
					Query q = session.createQuery("from todo");
					System.out.println(q.list());
					/*
					 * List<Todo> l = dao.getAllToDos();
					 * 
					 * for (Todo t1 : l) { System.out.println(l.toString()); }
					 */

					break;
				//case 3:
					/*
					 * System.out.print("enter UID: "); uId = br.readLine().toString();
					 * System.out.println(dao.findById(uId)); break; case 4:
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
