package basic;

public class fabonaci {

	public static void main(String[] args) {
		// fabonaci no is defined by sum of the wto previous fabonaci no;
		//fab(0)=0
		//fab(1)=1
        //fab(2)=fab(0)+fab(1);
		System.out.println(fab(5));
	}
	static int fab(int n){
		if(n==0){
			
		return n;}
		else if(n==1){
			return 1;
			
		}
		else{
			return ((fab(n-1))+(fab(n-2)));
		}
		
		
	}

}
