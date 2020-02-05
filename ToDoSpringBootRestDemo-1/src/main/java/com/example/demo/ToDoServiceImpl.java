package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Service
@EnableTransactionManagement
public class ToDoServiceImpl implements ToDoService {

	private ToDoDao toDoDao;

	@Autowired
	public ToDoServiceImpl(ToDoDao toDoDao) {
		super();
		this.toDoDao = toDoDao;
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public List<ToDo> getAllToDo() {
		return toDoDao.findAll();
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public Optional<ToDo> findId(Integer todoId) {
		Optional<ToDo> td = toDoDao.findById(todoId);
		return td;
	}

	@Override
	public ToDo createToDo(ToDo todo) {
		return toDoDao.save(todo);
	}

	@Override
	public void deleteToDoById(Integer todoId) {
		toDoDao.deleteById(todoId);
	}

	@Override
	public void deleteToDos() {
		toDoDao.deleteAll();
	}

	@Override
	public List<ToDo> findName(String todoName) {
		return toDoDao.findByTodoName(todoName);
	}

	/*
	 * @Transactional public Optional<ToDo> findById(Integer id) { return
	 * toDoDao.findById(id);
	 * 
	 * }
	 */

}
