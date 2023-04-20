package basic;

public class Arrays {

	public static void main(String[] args) {
		//declare array explicitly;
	String country[]={"japan","india","chaina","nepal","pakistan","srilanka","bangladesh"};
	System.out.println(country[0]);
	System.out.println(country[1]);
	System.out.println(country[2]);
	System.out.println(country[3]);
	System.out.println(country[4]);
	System.out.println(country[5]);
	System.out.println(country[6]);
//declaring array using new keyword and it's also called implicitly declirion
String[] state=new String[5];
  state[0]="biahr";
  state[1]="jharkhand";
  state[2]="delhi";
  state[3]="bengal";
  state[4]="utarperdesh";
  System.out.println("*************");
  System.out.println( state[0]);
  state[0]="tokiyo";
  System.out.println("*************");

  System.out.println( state[0]);
//declare array;
  String[] cities;
cities=new String[3];
cities[0]="patna";
cities[1]="chapra";
System.out.println("*************");
System.out.println(cities[1]);
//do-while loop condition means do first then apply condition .this is used for undefined loop end 
int i=0;
do{
	System.out.println("-----------------");
	System.out.println("cities "+cities[i]);
	i++;
	
     }while(i<2);
//while loop:-A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. 
//The while loop can be thought of as a repeating if statement.
int n=0;
boolean citiesFound=false;
while(!citiesFound){
	String citi=cities[n];
	System.out.println("======= "+citi);
	if(citi=="patna"){
		System.out.println("city found");
		citiesFound=true;//use for break the condition
	}
	n++;
	
}
//for loop
System.out.println("\n");
for(int j=0;j<3;j++){
	System.out.println("##########  "+ cities[j]);
}


	}

}
