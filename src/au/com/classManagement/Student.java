package au.com.classManagement;

public class Student {

		private String name;
		private int tfn;
		
		public Student (String name, int tfn) {
			this.name = name;
			this.tfn = tfn;
	}

		public String getName() {
			return name;
		}


		public int getTfn() {
			return tfn;
		}
		
		@Override
		public String toString() {
			return "Aluno: " + name + " TFN: " + tfn +".\n";
			
		}

}
