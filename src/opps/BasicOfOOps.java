package opps;
 class Persion{
	String name;
	String fruit;
	String phoneNo;
	Persion(String name,String fruit,String phoneNo){
		this.name=name;
		this.fruit=fruit;
		this.phoneNo=phoneNo;
		System.out.println(name + " "+fruit + " "+ phoneNo);
	}
	public Persion() {
		// TODO Auto-generated constructor stub
	}
	void walk(){
		System.out.println(name+ "  walking");
		
	 }
        void eat(){
	System.out.println(" Eating "  +  fruit);
		
	}
      void sleep(){
	System.out.println(name + " sleeping");
	
      }
 }
 public class BasicOfOOps{
	public static void main(String[] args) {
		Persion p=new Persion();
		Persion p1=new Persion("khan", "apple", "8940389493");
		p.name="saukat";
		p.fruit="mango";
		p.phoneNo="8940389493";
		p.walk();
		p.eat();
		p.sleep();
		p1.walk();
		p1.eat();
		p1.sleep();
		

	}
 }
 
