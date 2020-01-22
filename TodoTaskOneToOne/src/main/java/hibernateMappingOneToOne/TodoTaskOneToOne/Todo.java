package hibernateMappingOneToOne.TodoTaskOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String todoId;
	private String todoName;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="task_id")
	private Task taskDetail;
	
	public Todo() {}
	
	public Todo(String todoName) {
		this.todoName = todoName;
	}

	public String getTodoId() {
		return todoId;
	}

	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public Task getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(Task taskDetail) {
		this.taskDetail = taskDetail;
	}

	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", todoName=" + todoName + ", taskDetail=" + taskDetail + "]";
	}
	
	
	
}
