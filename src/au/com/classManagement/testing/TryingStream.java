package au.com.classManagement.testing;

import java.util.Comparator;

import au.com.classManagement.Course;
import au.com.classManagement.Student;
import au.com.classManagement.Video;

public class TryingStream  {
	public static void main(String[] args) {
		Course javaCollections = new Course("Java Collections", "Vittor");

		javaCollections.addition(new Video("Working with Arraylist", 21));
		javaCollections.addition(new Video("Creating with Arraylist", 32));
		javaCollections.addition(new Video("Working with Collections", 15));

		Student a1 = new Student("Vittor", 345337);
		Student a2 = new Student("Vini", 245222);
		Student a3 = new Student("Nat", 547225);

		javaCollections.additionStudents(a1);
		javaCollections.additionStudents(a2);
		javaCollections.additionStudents(a3);
		
		

		javaCollections.getStudents().forEach(s -> System.out.println(s));
		
		javaCollections.getStudents().stream()
		.filter(c -> c.getTfn() >= 345337)
		.forEach(c -> System.out.println(c.getStudentName()));
	


	}

}
