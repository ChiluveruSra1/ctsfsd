package comm.Task;
  
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Task {
	
	private String taskId;
	String taskName;
	String crtedBy;
	  //create Task
	public Task createTask(String taskName, String crtedBy) {
		Task tk=new Task();
		tk.setTaskId(UUID.randomUUID().toString());
		tk.setTaskName(taskName);
		tk.setCrtedBy(crtedBy);
		return tk;
	}
	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println();
	}
	
}
