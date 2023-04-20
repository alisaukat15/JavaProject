package basic;

public class Strings {

	public static void main(String[] args) {
		/* Strings=string is basically an object that represents sequence of char values. An array of characters works same as Java string
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);
		there are 2 way to create string object -1 by literally-{String s="javatpoint"; }  or via new kewword=  char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);
		The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
		Note: String objects are stored in a special memory area known as the "string constant pool".
		Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool,
		 a reference to the pooled instance is returned. If the string doesn't exist in the pool, 
		a new string instance is created and placed in the pool
		by new key word;-String s=new String("Welcome");//creates two objects and one reference variable  
		In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. 
		The variable s will refer to the object in a heap (non-pool).
		*String objects are immutable. Immutable simply means unmodifiable or unchangeable.*
		*once String object is created its data or state can't be changed but a new String object is created
		*
		
		*/ 
		String s="Sachin";  
		   s=s.concat(" Tendulkar");  
		   System.out.println(s);  
	}

}
