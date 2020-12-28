class StudentTest{
	public static void main(String[] args){
		//1. creating a new student object
		Student s = new Student();
		
		//new Student() will create an object which will be assigned to variable s. s is having a data type of Student.
		
		//2. setting student's state
		s.id = 1000;
		s.name = "Joan";
		s.gender = "male";
		
		//3. updating profile with correct names.updateProfile("John");
		s.updateProfile("John");
	
	}
}