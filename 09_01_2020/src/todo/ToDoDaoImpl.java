package todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao {
	List<ToDo> todoList=null;
	{
		todoList=new ArrayList<ToDo>();
	}
	private ToDo td;
	
	@Override
	public ToDo crtToDo(String todoName) {
		String[] str=UUID.randomUUID().toString().split("-");
		td=new ToDo(str[1], todoName);
		todoList.add(td);
		return td;
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return todoList;
	}

	@Override
	public ToDo findId(String todoId) {
		// TODO Auto-generated method stub
		
	//	Iterator<ToDo> iterator=todoList.iterator();
		
		/*
		 * while(iterator.hasNext()) { td=iterator.next(); if(td.getTodoId()==todoId) {
		 * 
		 * System.out.println(td.getTodoId()); break; } } return td;
		 */
		for(ToDo t:todoList)
		{
			if(t.getTodoId().equals(todoId))
			{
				td=t;
				System.out.println("found.");
			}
		}
		return td;
	}

	@Override
	public void deleteToDo(String todoId) {
		if(todoList.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}
		td=findId(todoId);
		if(td==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			todoList.remove(td);
			//System.out.println("remoded sucessfully with id: "+todoId);
		}
		
	}
	
	@Override
	public void removeAllToDo() {
		todoList.removeAll(todoList);
		
	}

	@Override
	public void updateToDo(String oid) {
		for(ToDo t:todoList)
		{
			if(t.getTodoId().equals(oid))
			{
				System.out.println("found.");
				String n=t.getTodoName();
				td=crtToDo(n);
				System.out.println(td);
				deleteToDo(oid);
				break;
			}
			else {
				System.out.println("not found");
			}
		}
		
}

	
		

	
}
