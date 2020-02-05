package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo1Application { //implements CommandLineRunner{

	/*
	 * private ToDoDao toDoDao;
	 * 
	 * // @Autowired public SpringBootDemo1Application(ToDoDao toDoDao) { super();
	 * this.toDoDao = toDoDao; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * toDoDao.save(new ToDo(1, "todo 1")); toDoDao.save(new ToDo(2, "todo 2"));
	 * toDoDao.save(new ToDo(3, "todo 3")); toDoDao.save(new ToDo(4, "todo 4"));
	 * toDoDao.save(new ToDo(5, "todo 5")); toDoDao.save(new ToDo(6, "todo 6"));
	 * toDoDao.save(new ToDo(7, "todo 7")); toDoDao.save(new ToDo(8, "todo 8"));
	 * toDoDao.save(new ToDo(9, "todo 9"));
	 * 
	 * }
	 */

}
