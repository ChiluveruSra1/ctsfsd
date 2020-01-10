package todo;

import java.util.List;

public interface ToDoDao {
	public ToDo crtToDo(String todoName);
	public List<ToDo> getAllToDos();
	public ToDo findId(String todoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
	public void updateToDo(String oid);

}
