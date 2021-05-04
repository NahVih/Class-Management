package au.com.classManagement;


public class Student {

		private String studentName;
		private int tfn;
		
		public Student (String name, int tfn) {
			if (name == null) {
				throw new NullPointerException("Name can not be null");
			}
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
		@Override
		public boolean equals(Object obj) {
			Student otherStudent = (Student) obj;
			return this.studentName.equals(otherStudent.studentName);	
		}
		@Override
		public int hashCode() {
			return this.studentName.hashCode();
		}


		

}
