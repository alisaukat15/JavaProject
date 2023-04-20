package opps;

public class BankAccount implements IRate {
	 /*static belongs to the class not to the instance
	 final is the fixed/constant*/
	 static final String routingNo="841418";
	 //all are initial variable
	private String accountNo;
	private String name;
	private String ssn;
	 double balance=0;
	private String acountType;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcountType() {
		return acountType;
	}
	public void setAcountType(String acountType) {
		this.acountType = acountType;
	}
	public static String getRoutingno() {
		return routingNo;
	}
	/*
	1.they r used to define /setup/insilize the object
	2.consructor name sould be same as class name
	3.constructors are implicitly called while creating the object;
	4.constructors have no return type*/
	public void setter(String name){
		this.name=name;
	}
	public String getter(){
		
		return name;
	}
	public BankAccount() {
System.out.println("account has been created");	}
	
	public BankAccount(String accountType) {
		this.acountType=accountType;
System.out.println("New Account:-- " + accountType);	}
	
	public BankAccount(String accountType,double inisDeposite) {
		//String accountType,double inisDeposite,String msg all are local variable;
		System.out.println("New Account:-- " + accountType);	
		System.out.println("Total deposite is $ " + inisDeposite);
		String msg=null;
		if(inisDeposite<1000){
			msg="ERROR;-INISIAL DEPOSITE MUST BE $1000";
			
		}else{
			msg="Thanks for deposite of $ " + inisDeposite;
			
		}
		System.out.println(msg);
		System.out.println(balance=balance+inisDeposite);
		
	}
	
	
	 void deposite(double amaunt){
		balance=balance+amaunt;
showActivity("deposite");	}
	
	private void showActivity(String activity ) {
		System.out.println("your recent trancection is " +activity);
		System.out.println("your new balance:= $ " + balance);
		
	}

	public void withdrow(double amaunt){
		balance=balance-amaunt;
		showActivity("withdrow");	
		}
	
	void status(){}
	void ministatement(){
		System.out.println("balance " +balance);
	}
	//void accountType(){}
	@Override
	public String toString(){
		return "[ " +name+ " "+accountNo+  "routing no"+ routingNo+" balance in $  " + balance+ " ]";
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Setting rate ");
	}
	@Override
	public void IncreaseRate() {
System.out.println("inceasing the rate");		
	}
}
