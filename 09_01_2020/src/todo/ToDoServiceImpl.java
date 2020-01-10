package todo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ToDoServiceImpl implements ToDoService {
	ToDoDaoImpl tdao=new ToDoDaoImpl();
	
		
	@Override
	public ToDo crtToDo(String todoName) {
		return tdao.crtToDo(todoName);
		
		}

	@Override
	public List<ToDo> getAllToDos() {
		return tdao.getAllToDos();
	}

	@Override
	public ToDo findId(String todoId) {
		return tdao.findId(todoId);
	}
	
	@Override
	public void deleteToDo(String todoId) {
		tdao.deleteToDo(todoId);
		
	}

	@Override
	public void removeAllToDo() {
		tdao.removeAllToDo();
		
	}
	
	@Override
	public void updateToDo(String oid) {
		// TODO Auto-generated method stub
		tdao.updateToDo(oid);
	}

	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ToDoService tds=new ToDoServiceImpl();
		int choice=0;
		do {
		System.out.println("\n1. create todo");
		System.out.println("2. display all todo");
		System.out.println("3. find todo");
		System.out.println("4. Update todo");
		System.out.println("5. Remove todo");
		System.out.println("6. Remove All todo's");
		System.out.println("0. exit");
		System.out.print("Enter your choice: ");
		try {
			choice=sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		}
		switch (choice) {
		case 1:
			System.out.print("provide task name: ");
			ToDo toDo=tds.crtToDo(sc.next());
			System.out.println("\nTODO Created sucessfully: "+toDo);
			break;
		case 2:
			List<ToDo> list=tds.getAllToDos();
			for (ToDo t : list) 
				System.out.println(t);
			break;
		case 3:
			System.out.print("provide todo Id: ");
			ToDo toDo1=tds.findId(sc.next());
			if(toDo1 != null)
			{
				System.out.println(toDo1);
			}
			else {
				System.out.println("no such todo available");
			}
			break;
		case 4:
			System.out.print("provide oldtodo Id: ");
			tds.updateToDo(sc.next());
			break;
		case 5:
			System.out.print("provide todo Id: ");
			tds.deleteToDo(sc.next());
			break;
		case 6:
			tds.removeAllToDo();
			System.out.println("batch remove sucessfull");
			break;
		case 0:
			System.out.println("bye");
			System.exit(0);
			break;

		default:
			System.out.println("invalid choice");
			break;
		}
			
		}while(choice !=0);
	}

	

	}