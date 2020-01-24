package hibernateMappingOneToMany.PostComment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice = 0;
		Post post = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			SessionFactory factory = new Configuration().configure().addAnnotatedClass(Post.class)
					.addAnnotatedClass(Comment.class).buildSessionFactory();
			Session session = factory.openSession();
			do {
				System.out.println("======================\n1. Add Post");
				/*
				 * System.out.println("2. Add Comment"); System.out.println("3. update Post");
				 * System.out.println("4. update comment");
				 * System.out.println("5. delete Post");
				 */
				System.out.println("2. delete comment");
				System.out.println("3. delete post");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				int uId;
				switch (choice) {
				case 1:
					System.out.print("enter the no. of Post's u want to add: ");
					int n1 = Integer.parseInt(br.readLine().toString());
					for (int i = 0; i < n1; i++) {
						System.out.print("Enter name: ");
						String name = br.readLine().toString();
						String cid[] = UUID.randomUUID().toString().split("-");
						post = new Post(name, LocalDate.now());
						System.out.print("Enter comment: ");
						String txt = br.readLine().toString();
						post.getComments().add(new Comment(txt, LocalDateTime.now()));
						session.getTransaction().begin();
						session.save(post);
						session.getTransaction().commit();
						System.out.println("done");
					}
					break;

				case 2:
					System.out.print("enter comment id:");
					int id=Integer.parseInt(br.readLine().toString());
					session.getTransaction().begin();
					Comment c = session.get(Comment.class, id);
					if (c == null)
						System.out.println("not found ");
					
					session.delete(c);
					session.getTransaction().commit();
					System.out.println("done");
					break;
				case 3:
					System.out.print("enter comment id:");
					int id1=Integer.parseInt(br.readLine().toString());
					session.getTransaction().begin();
					Post p1 = session.get(Post.class, id1);
					if (p1 == null)
						System.out.println("not found ");
					
					session.delete(p1);
					session.getTransaction().commit();
					System.out.println("done");
					break;

				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		} finally {
			// session.close();
		}
	}
}
