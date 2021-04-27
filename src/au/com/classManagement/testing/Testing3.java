package au.com.classManagement.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import au.com.classManagement.Course;
import au.com.classManagement.Video;

public class Testing3 {
	public static void main(String[] args) {
	Course javaCollections = new Course ("Java Collections", "Vittor");
	
	javaCollections.addition(new Video("Working with Arraylist", 21));
	javaCollections.addition(new Video("Creating with Arraylist", 32));
	javaCollections.addition(new Video("Working with Collections", 15));
	
	List<Video> videos = new ArrayList<>(javaCollections.getAulas());
	Collections.sort(videos);
	
	System.out.println(videos);
	System.out.println(javaCollections.getTotalTimeMap());
	System.out.println(javaCollections);
}
}
