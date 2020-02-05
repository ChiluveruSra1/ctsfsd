package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {

	List<ToDo> getAllToDo();

	Optional<ToDo> findId(Integer todoId);

	ToDo createToDo(ToDo todo);

	void deleteToDoById(Integer todoId);

	void deleteToDos();

	List<ToDo> findName(String todoName);


}
