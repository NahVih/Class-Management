package au.com.classManagement.testing;

import java.util.List;

import au.com.classManagement.Course;

public class Testing {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	List<Class> javaclasses = javaCollections.getAulas();
	System.out.println(javaclasses);
}
}
