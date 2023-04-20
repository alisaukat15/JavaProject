package opps;

public class BankAccountApp {

	public static void main(String[] args) {
BankAccount acc=new BankAccount();
acc.setter("saukat");
System.out.println(acc.getter());
/*acc.accountNo="0111";
acc.name="saukat";*/
acc.balance=5000;
/*acc.deposite(15000);
acc.deposite(15000);
acc.deposite(15000);
acc.withdrow(1000);*/
acc.setRate();
acc.IncreaseRate();
//System.out.println(acc.toString());
/*
System.out.println(acc.accountNo);
System.out.println(BankAccount.routingNo);
BankAccount acc1=new BankAccount("current account");
acc1.accountNo="01112";
System.out.println(acc1.accountNo);
System.out.println(BankAccount.routingNo);
BankAccount acc2=new BankAccount("Saving account",5000);
acc2.accountNo="01113";
System.out.println(acc2.accountNo);
System.out.println(BankAccount.routingNo);
*/

//*******Demo cdaccount
/*CDAccount cda=new CDAccount();
cda.balance=5000;
cda.name="ali";
cda.acountType="ali";
cda.compound();
cda.insterstRate="4.5";
System.out.println(cda.toString());*/

	}

}
