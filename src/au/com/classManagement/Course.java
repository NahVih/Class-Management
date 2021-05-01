package au.com.classManagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Course {

	private String courseName;
	private String instructor;
	private List<Video> courseVideos = new LinkedList<Video>();

	private Set<Student> students = new TreeSet<Student>((Student student, Student otherStudent) -> student.getTfn() - otherStudent.getTfn());
	
////private Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {
////public int compare(Student student, Student otherStudent) {
////return student.getTfn() - otherStudent.getTfn();
////}
//});
	
	public Course(String name, String instructor) {
		this.courseName = name;
		this.instructor = instructor;
	}
	
	public String getName() {
		return courseName;
	}

	public String getInstructor() {
		return instructor;
	}
	
	public List<Video> getAulas(){
		return Collections.unmodifiableList(courseVideos);
	}
	public Set<Student> getStudents(){
		return Collections.unmodifiableSet(students);
	}
	
	public void addition (Video video) {
		this.courseVideos.add(video);
	}
	
	public void additionStudents (Student student) {
		this.students.add(student);
	}
	
	public void deleteStudents () {
		this.students = Collections.emptySet();;
	}
	
//	public int getTotalTime () {
//		int totalTime = 0;
//		for (Video video : courseVideos) {
//			totalTime += video.getTime();
//		}
//		return totalTime;
//	}
	
	public int getTotalTimeMap () {
		return this.courseVideos.stream().mapToInt(Video::getTime).sum();
	}
	
	@Override
	public String toString() {
		return "Course: " + courseName + ", Total Time: " + this.getTotalTimeMap() + "." + "Videos:\n" + this.courseVideos;
	}
	
	public boolean containtsStudent(Student string) {
		return this.students.contains(string);
	}



}
