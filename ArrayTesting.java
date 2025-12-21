package Beginn;



public class ArrayTesting {
	
	//Array-Codetesting
	
	
	
	public static void main(String[] args) {
		//sorted Array
		int array[] = {1,2,3,4,5,6};
		
		arrayMath(array);
		
		System.out.println(crossSum(111,0));
		
		System.out.println(countingNum(11111));
		
	
		
		
		
		
	}
	
	//counting the digits
	public static int countingNum(int num) {
		
		if (num !=0) {
			
			return 1 + countingNum(num/10);}
		return 0;
		
	}
	
	//cross sum from integer
	
	public static int crossSum(int h, int start) {
		
		if (h !=0) {
			
			start += h%10;
			return crossSum(h/10,start);
		}
		return start;
		
		
	}
	
	
	//Method for output for avg, median, highest und lowest integer
	public static void arrayMath(int [] array) {
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
			
		}
		
		System.out.println("Der Durschnitt ist : " + (double)sum/array.length);
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			if (min>array[i]) {
				
				min = array[i];
				
			}
			if (max<array[i]) {
				
				max = array[i];
				
			}
		}
		System.out.println("Minimimum = " + min + " Maximum = " + max);
		
		double median ;
		
		//looking for the median in sorted arrays in 2 cases
		if (array.length%2==0) {
			
			median = (array[array.length/2]+array[array.length/2-1])/2.0;
		}
		else {median = array[array.length/2];}
		
		System.out.println("Median = " + median);
		
	}
	
	
	
	
	
	
}

