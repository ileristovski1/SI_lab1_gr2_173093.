public class Student {
	public class Student {
		String index;
		String firstName;
		String lastName;
		int grades[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		
		public Student(String index, String firstName, String lastName, int[] grades) {
			super();
			this.index = index;
			this.firstName = firstName;
			this.lastName = lastName;
			this.grades = grades;
		}

		public double getAverage() {
			int zbir = 0;
			for(int i=0 ; i<grades.length ; i++
			{
				zbir += grades[i];	
			}
			return (double) zbir/grades.length;

		}


		public String getIndex() {
			return index;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int[] getGrades() {
			return grades;
		}

		public void setGrades(int[] grades) {
			this.grades = grades;
		}

		public int ECTSCredits() {
			int krediti = 0;
			for(int i=0 ; i<grades.length ; i++
			{
				if(grades[i] > 5 )
				{
					krediti += 6;
				}	
			}
			return krediti;
			//TODO
		}

}
