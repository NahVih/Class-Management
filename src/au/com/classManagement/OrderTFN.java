package au.com.classManagement;

import java.util.Comparator;

public class OrderTFN implements Comparator<Student>{
	@Override
	public int compare(Student student, Student otherStudent) {
		return student.getTfn() - otherStudent.getTfn();
	}
}
