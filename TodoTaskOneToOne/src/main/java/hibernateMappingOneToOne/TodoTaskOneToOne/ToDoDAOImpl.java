package hibernateMappingOneToOne.TodoTaskOneToOne;

import java.util.ArrayList;
import java.util.List;

public class ToDoDAOImpl implements ToDoDAO {
	
	List<Todo> todoList=null;
	{
		todoList=new ArrayList<Todo>();
	}
	private Todo td;
	

	@Override
	public Todo crtToDo(String todoName,String taskName) {
		Todo td1=new Todo(todoName);
		td1.setTaskDetail(new Task(taskName));
		return td1;	
		}

	@Override
	public List<Todo> getAllToDos() {
		// TODO Auto-generated method stub
		return todoList;
	}

	@Override
	public ToDoDAO findId(String todoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteToDo(String toDoId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAllToDo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateToDo(String oid) {
		// TODO Auto-generated method stub

	}

	
}
