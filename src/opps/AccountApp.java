package opps;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub a=new AccountApp();
LoanAccount la=new LoanAccount();
la.IncreaseRate();
la.setRate();
la.SetAmmortSchedule();
la.setTerm(20);
IRate account1=new LoanAccount();
account1.IncreaseRate();
account1.setRate();
	}

}
