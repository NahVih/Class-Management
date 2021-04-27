package au.com.classManagement.testing;

import au.com.classManagement.Course;
import au.com.classManagement.Video;

public class Testing2 {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	
	javaCollections.addition(new Video("Working with Arraylist", 21));
	
	System.out.println(javaCollections.getAulas());
}
}
