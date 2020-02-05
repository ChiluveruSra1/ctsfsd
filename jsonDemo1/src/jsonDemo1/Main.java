package jsonDemo1;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String args[]) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			Student student=mapper.readValue(new File("student.json"), Student.class);
			System.out.println(student);
			
			String studentJson=mapper.writeValueAsString(student);
			System.out.println(studentJson);
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
