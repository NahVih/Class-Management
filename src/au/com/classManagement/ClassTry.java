package au.com.classManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClassTry {

	public static void main(String[] args) {

		Class a1 = new Class("Arraylists", 21);
		Class a2 = new Class("toString", 42);
		Class a3 = new Class("Objects", 11);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(a1);
		classes.add(a2);
		classes.add(a3);
		
		System.out.println(classes);
		
		Collections.sort(classes);
		
		System.out.println(classes);
		
		Collections.sort(classes, Comparator.comparing(Class::getTime));
		
		System.out.println(classes);
		
	}


}
