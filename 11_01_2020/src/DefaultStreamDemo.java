import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class DefaultStreamDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter name: ");
			String name=br.readLine();
			System.out.format("your name: %s\n", name);
			System.out.println("Enter age: ");
			int age=Integer.parseInt(br.readLine().toString());
			System.out.format("your age: %d", age);
		} catch (NumberFormatException e) {
			//System.err.println(e.getStackTrace().toString());
			e.printStackTrace();
		}

	}

}