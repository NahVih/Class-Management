package au.com.classManagement.testing;

import java.util.List;

import au.com.classManagement.Course;
import au.com.classManagement.Video;

public class Testing {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	
	List<Video> videos = javaCollections.getAulas();	
	javaCollections.addition(new Video("Working with Arraylist", 21));
	
	System.out.println(videos);
}
}
