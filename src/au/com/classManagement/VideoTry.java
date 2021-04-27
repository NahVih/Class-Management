package au.com.classManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VideoTry {

	public static void main(String[] args) {

		Video a1 = new Video("Arraylists", 21);
		Video a2 = new Video("toString", 42);
		Video a3 = new Video("Objects", 11);
		
		ArrayList<Video> classes = new ArrayList<>();
		classes.add(a1);
		classes.add(a2);
		classes.add(a3);
		
		System.out.println(classes);
		
		Collections.sort(classes);
		
		System.out.println(classes);
		
		Collections.sort(classes, Comparator.comparing(Video::getTime));
		
		System.out.println(classes);
		
	}


}
