package basic;

public class UseFunction {
	//there are two type of function we that 
	//1 without argument:-it might have return type or not depend on the programmer
	//2 with arguments:-it might have return type or not depend on the programmer
	//void-means no return type,if we do not give any type the system will consider void only.
	//function must have access type:-1 public,private,protected,(default or package level),
	//function might be static or non static
	//static:-we can call directly without creating any object but in non static we must create object and than call using object name.
	public static void main(String[] args) {
		//calling all the function 
		printName();
		addTwoNumber(199, 24);
		multiply(2000.5, 10.4);
	}
	// creating a fuction without return type
	public static void printName(){
		System.out.println("this is saukat ali");
	}
	// creating a fuction without return type
	public static void addTwoNumber(double product,double product2){
		double sum =product + product2;
		System.out.println("the sum of " + product +" and " +product2 +"is"+sum);
		}
	// creating a fuction with return type
	public static double multiply(double d ,double e){
		double product = d*e;
		System.out.println("the 2 number product is "+product );
		// calling fuction in side the function 
		addTwoNumber(product, product);
		System.out.println("the 2 number addition  is "+product );
		return product;
		
	}
	}
	


