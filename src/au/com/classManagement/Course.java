package au.com.classManagement;

import java.util.LinkedList;
import java.util.List;

public class Course {

	private String name;
	private String instructor;
	private List<Class> classes = new LinkedList<Class>();
	
	public Course(String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
	}
	
	public String getName() {
		return name;
	}

	public String getInstructor() {
		return instructor;
	}
	
	public List<Class> getAulas(){
		return classes;
	}
}
