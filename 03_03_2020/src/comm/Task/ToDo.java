package comm.Task;

import static java.lang.System.out;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ToDo {

	private static final int MAX = 10;
	
	private String todoID, type;
	private String c;
	private LocalDate dt;
	private boolean isCmpt;
	
	private  ToDo td;
	private  Task tk = new Task();
	static Scanner sc = new Scanner(System.in);

	public ToDo(Task tk) {

		this.tk = tk;
		

	}

	public ToDo() {
		// TODO Auto-generated constructor stub
		//td=new ToDo();
	}

	public ToDo crtToDo(String taskName, String crtedBy, boolean isCmpt) {
		randomFortuneService();
		td=new ToDo();
		Task tempTask=tk.createTask(taskName, crtedBy);

		td.setTodoID(UUID.randomUUID().toString());
		td.setDt(LocalDate.now());
		td.setCmpt(isCmpt);
		td.setTk(tempTask);
		System.out.print("Is task completed(yes/no): ");
		setType(sc.next());
		return td;

	}

	private String randomFortuneService() {
		// TODO Auto-generated method stub
		String quotes[] = new String[5];
		quotes[0] = "1.When you’re playing small and want to break out of your current limitations…";
		quotes[1] = "2.When you’re feeling blue or things are a little flat…\r\n";
		quotes[2] = "3.When you want to make your life feel better and your thoughts more positive…\n";
		quotes[3] = "4.When you want to take control of your life and make the most of everything around you…\r\n";
		quotes[4] = "5.When good things are taking too long to manifest and you’re starting to lose faith…\n";

		int rnd = new Random().nextInt(quotes.length);
		return quotes[rnd];
	}

	public void displayDetails() {
		String id1[] = tk.getTaskId().split("-");
		out.println("---------------------------------------------------------------------------------");
		out.print(randomFortuneService());
		out.print("\nTask ID: " + (id1[0] + id1[1]) + "\nTaskName: " + tk.taskName + "\nCreated By: " + tk.crtedBy);
		out.println("\nToDo ID: " + getTodoID() + "\nToDo Date: " + getDt() + "\nCompleted: " + getType());
		out.println("---------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		/*
		 * ToDo t1 = new ToDo(); td = new ToDo(tk);
		 * 
		 * // ToDo td1[]=new ToDo[MAX];
		 * 
		 * // String td1[]=new String[MAX];
		 */ 
		String tn, cb;
		boolean c = false;
		int todoNo = -1,num = -1;
		
		ToDo td=new ToDo();
		ToDo[] td1=new ToDo[MAX];
		
		
		Scanner sc = new Scanner(System.in);
		int ch = -1;

		do {
			System.out.println("1. Create ToDo\n2. Display ToDo Details\n3. Remove ToDo\n0. Exit");
			System.out.print("choose (1,2,0) : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				//for(int i=0;i<todoNo;i++) {
				//todoNo++;
				System.out.println("ToDo Number: " + (todoNo+2));
				System.out.print("Enter task name: ");
				tn = sc.next();
				System.out.println("Enter author name: ");
				cb = sc.nextLine();
				td1[++todoNo]=td.crtToDo(tn, cb, c);
				int i=todoNo;
				System.out.println("i= "+i+"\t\ttodoNo= "+todoNo);
			//	td1[todoNo].displayDetails();
				break;
			case 2:
					for(int j=0;j<=todoNo;j++){
						//System.out.println(j);
						if(num==j) {
							continue;
						}
					td1[j].displayDetails();}
				break;
			case 3:
				System.out.println("enter the todoNo: ");
				num=sc.nextInt();
				td1[num]=null;
			case 0:
				
				out.println("\bExit");
				break;
			}
		} while (ch != 0);

	}
}
