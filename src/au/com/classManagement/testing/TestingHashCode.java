package au.com.classManagement.testing;

import au.com.classManagement.Course;
import au.com.classManagement.Student;
import au.com.classManagement.Video;

public class TestingHashCode {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	
	javaCollections.addition(new Video("Working with Arraylist", 21));
	javaCollections.addition(new Video("Creating with Arraylist", 32));
	javaCollections.addition(new Video("Working with Collections", 15));
	
	Student a1 = new Student("Vittor", 345337);
	Student a2 = new Student("Vini", 245222);
	Student a3 = new Student("Nat", 147225);
	
	javaCollections.additionStudents(a1);
	javaCollections.additionStudents(a2);
	javaCollections.additionStudents(a3);
	
//	javaCollections.getAulas().add(new Video("Testing with Collections", 18));
	
	System.out.println(javaCollections);
	
	
	System.out.println(javaCollections.getStudents());
	
//	javaCollections.getStudents().forEach(a -> {
//		System.out.println(a);
//	});
	
	System.out.println(javaCollections.containtsStudent(a1));
	System.out.println(a1.getStudentName());
	
	Student Vittor = new Student("Vittor", 124585);
	System.out.println("Vittor is a Student?" + a1.equals(Vittor));
	
	System.out.println(Vittor.hashCode());
	System.out.println(a1.hashCode());
	

}
}
