package basic;

public class wheather {
public static void main(String[] args) {
	// progaram is give you suggestion for what to wear based on the wheater condion (Temparature and sun condition)  
	int temparature=70;
	String suncondition="overCast";
	if(temparature>80)
		System.out.println("is is pleasent to wear shirt and t short");
	else if (temparature>60 && suncondition!="overCast") {//both condition should match
		System.out.println("it is littile cooler .perhops wear full sleve shirt and jeans");
		System.out.println("wear hat for keeping sun out of eyes");}
		    else if (temparature>50 || suncondition=="overCast") {//any one of condtion should match means is will working
			  System.out.println("this is a cool day please wear sweater");
			}
		    else {
				System.out.println("look like temparature is very low ");
			}
	System.out.println("program is ended");
 }
}
