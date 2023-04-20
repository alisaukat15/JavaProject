package basic;

public class Array {
	static int min=0;
	static int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	public static void main(String[] args) {
		
		averageOfTheArray(array);
		System.out.println(maxArray(array));
		System.out.print(minArray(array));
		
		}
	
		static void averageOfTheArray(int[] array) {
			int length = array.length;
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	           sum += array[i];
	        }
	        double average = sum / length;
	         
	        System.out.println("Average of array : "+average);
			}
		//*******************
		static int maxArray(int [] array){
			   int max = array[0];
			         for (int i = 1; i < array.length; i++)
			            if (array[i] > max)
			                max = array[i];
			         
			        return max;
			    }
	    //********************************
		static int minArray(int [] array){
			   int min = array[0];
			         for (int i = 1; i < array.length; i++)
			            if (array[i] < min)
			                min = array[i];
			         
			        return min;
			    }
		}


			
		

