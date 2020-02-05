package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.execptionHandlers.ToDoError;
import com.example.demo.execptionHandlers.ToDoNotFoundException;

@RestController
@RequestMapping("/todos")
public class ToDoRestCntllr {
	
	private ToDoService toDo;

	@Autowired
	public ToDoRestCntllr(ToDoService toDoDao) {
		super();
		this.toDo = toDoDao;
	}
	
	@PostMapping("/all")
	public ToDo createTodo(@RequestBody ToDo todo) {
		todo.setTodoId(0);
		return toDo.createToDo(todo);
	}
	
	
	@GetMapping("/all")
	public List<ToDo> getTodos(){
		return toDo.getAllToDo();
	}
	
	@GetMapping("/{todoId}")
	public Optional<ToDo> findById(@PathVariable Integer todoId) {
		Optional<ToDo> todo=toDo.findId(todoId);
		
		if(todo.isPresent())
			return todo;
		else {
			throw new ToDoNotFoundException("Todo not found with id: "+todoId);
		}
		
	}
	
	@PutMapping("/all")
	public ToDo updateBook(@RequestBody ToDo todo)	{	
		return toDo.createToDo(todo);
	}
	
	@GetMapping("/findname/{todoName}")
	public List<ToDo> findbyName(@PathVariable String todoName){
		return toDo.findName(todoName);

	}
	
	@DeleteMapping("/d/{todoId}")
	public void deleteById(@PathVariable Integer todoId)
	{
		toDo.deleteToDoById(todoId);
		
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAll()
	{
		toDo.deleteToDos();
	}
	
	@ExceptionHandler
	public ResponseEntity<ToDoError> error1(ToDoNotFoundException tde){
		ToDoError error=new ToDoError();
		error.setMessage(tde.getMessage());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setErrorTime(LocalDateTime.now());
		return new ResponseEntity<ToDoError>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<ToDoError> error2(Exception e){
		ToDoError error=new ToDoError();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setErrorTime(LocalDateTime.now());
		return new ResponseEntity<ToDoError>(error,HttpStatus.BAD_REQUEST);
		
	}

}
