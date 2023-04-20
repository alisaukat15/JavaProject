package basic;

public class FacotialNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));

	}
	static int fact(int n){
		if(n==0){
			return 1;
			}
		else if(n==1){
			return 1;
			}
		else {
			//System.out.println(n*fact(n-1));
			return n*fact(n-1);
		}
	}

}
