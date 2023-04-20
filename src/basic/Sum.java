package basic;

public class Sum {
	static int  sum1=0;
	
	public static void main(String[] args) {
		System.out.println(sum(5));
		}
	static int sum(int a){
		
		for(int i=1;i<=a;i++){
			System.out.println(sum1 + " + " + i);
			sum1=sum1+i;}
		return sum1;
	}
	}
