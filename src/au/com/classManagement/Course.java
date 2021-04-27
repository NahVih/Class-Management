package au.com.classManagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {

	private String name;
	private String instructor;
	private List<Video> courseVideos = new LinkedList<Video>();
	
	public Course(String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
	}
	
	public String getName() {
		return name;
	}

	public String getInstructor() {
		return instructor;
	}
	
	public List<Video> getAulas(){
		return Collections.unmodifiableList(courseVideos);
	}
	
	public void addition (Video video) {
		this.courseVideos.add(video);
	}
	
	public int getTotalTime () {
		int totalTime = 0;
		for (Video video : courseVideos) {
			totalTime += video.getTime();
		}
		return totalTime;
	}
	
	public int getTotalTimeMap () {
		return this.courseVideos.stream().mapToInt(Video::getTime).sum();
	}
	
	@Override
	public String toString() {
		return "Course: " + name + ", Total Time: " + this.getTotalTime() + "." + "Videos:\n" + this.courseVideos;
	}
}
