package au.com.classManagement;


public class Student {

		private String studentName;
		private int tfn;
		
		public Student (String name, int tfn) {
			this.studentName = name;
			this.tfn = tfn;
	}

		public String getStudentName() {
			return studentName;
		}


		public int getTfn() {
			return tfn;
		}
		
		@Override
		public String toString() {
			return "Student: " + studentName + " TFN: " + tfn +".\n";
			
		}

		

}
