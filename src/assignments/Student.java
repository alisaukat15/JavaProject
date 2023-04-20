package assignments;

public class Student {
	//static variable
	private static String userid;
	//***************
	//instance variable
	private static int id=10;
	long phone;
	String city;
	String state;
	String ssn;
	String name;
	private String email;
	private int balance;
	private static final int costOfCourse=800;
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		email = name.toLowerCase()+"."+id+"@gmail.com";
		System.out.println("your emailid is"+email);
	}
	private String courses;
	//*************
	//constructor
	Student(String name,String ssn,String userid){
		this.name=name;
		this.userid=userid;
		this.ssn=ssn;
		System.out.println(name + "@gmail.com");
	}
	//$$$$$$$$$$$$$$$$$$$$
	//Setter and getter method for phone, city, state 
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//***********########
	//## methods
	void enroll(String courses){
		this.courses=this.courses+" "+courses;
		balance=balance+costOfCourse;
	};
	void payTutionFee(){
		int amount = 0;
		System.out.println("payments= $ "+amount);
		balance=balance-amount;
	};
	void checkBalance(){
		System.out.println("your current balance is $"+balance);
	};
	public String toString(){
		return "[name"+name+"]\n[Courses"+courses+"]\n[Balance"+balance+"]";
		}
	public void showCourses(){
		 System.out.println(courses);
		
	}
	void setUserId(){
		int min=1000;
		int max=9000;
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int randomeNumber = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("random number = "+randomeNumber);  
		userid=id+""+randomeNumber+ssn;
		System.out.println("user id is "+userid);
		
		
	}
}
