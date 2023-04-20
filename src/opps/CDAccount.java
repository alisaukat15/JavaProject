package opps;

public class CDAccount extends BankAccount implements IRate {
	String insterstRate;
	void compound(){
		System.out.println("compounding interst");
	}

}
