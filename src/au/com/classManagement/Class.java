package au.com.classManagement;

public class Class implements Comparable<Class>{

	private String title;
	private int time;
	
	
	public Class(String string, int i) {
		this.title = string;
		this.time = i;
	}
	public String getTitle() {
		return title;
	}
	public int getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "Class: " + title + " Time: " + time;
		
	}
	@Override
	public int compareTo(Class o) {
		return this.title.compareTo(o.title);
	}
}
