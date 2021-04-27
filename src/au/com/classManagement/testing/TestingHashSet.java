package au.com.classManagement.testing;

import java.util.Collection;
import java.util.HashSet;

import au.com.classManagement.Course;
import au.com.classManagement.Video;

public class TestingHashSet {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	
	javaCollections.addition(new Video("Working with Arraylist", 21));
	javaCollections.addition(new Video("Creating with Arraylist", 32));
	javaCollections.addition(new Video("Working with Collections", 15));
	
	Collection<Video> videos = new HashSet<>(javaCollections.getAulas());
	
	System.out.println(videos);

}
}
