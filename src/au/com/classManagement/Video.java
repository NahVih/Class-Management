package au.com.classManagement;

public class Video implements Comparable<Video>{

	private String title;
	private int time;
	
	
	public Video(String string, int i) {
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
		return "Video: " + title + " Time: " + time +".\n";
		
	}
	@Override
	public int compareTo(Video o) {
		return this.title.compareTo(o.title);
	}
	

}
