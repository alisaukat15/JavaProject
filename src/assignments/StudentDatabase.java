package assignments;

public class StudentDatabase {
	public static void main(String[] args) {
		Student s=new Student("shirikant", "122","1");
		Student s1=new Student("saukat", "12","2");
		Student s3=new Student("ALI", "123","3");
		s.showCourses();
		s.setUserId();
		s.enroll("math12");
		s.enroll("english01");
		s.enroll("hindi1");
		s.setEmail();
		s.getEmail();
		s.toString();
	}
}
