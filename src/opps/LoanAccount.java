package opps;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("rate");
	}

	@Override
	public void IncreaseRate() {
		// TODO Auto-generated method stub
		System.out.println("increase erate");
	}
 public void setTerm(int term){
	 System.out.println("setting the term to:"+term+"years." );
 }
 public void SetAmmortSchedule(){
	 System.out.println("ammortization Schedule");
 }
 
}
