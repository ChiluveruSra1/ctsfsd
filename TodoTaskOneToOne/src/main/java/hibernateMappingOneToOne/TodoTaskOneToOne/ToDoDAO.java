package hibernateMappingOneToOne.TodoTaskOneToOne;

import java.util.List;

public interface ToDoDAO {
	public Todo crtToDo(String name, String taskName);

	public List<Todo> getAllToDos();

	public ToDoDAO findId(String todoId);

	public void deleteToDo(String toDoId);

	public void removeAllToDo();

	public void updateToDo(String oid);

}