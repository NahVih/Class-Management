package au.com.classManagement;

public class Class {

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
	
}
