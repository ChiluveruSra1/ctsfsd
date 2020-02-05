package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@org.springframework.transaction.annotation.Transactional
public interface ToDoDao extends JpaRepository<ToDo, Integer> {

	List<ToDo> findByTodoName(String todoName);

}
