package Beginn;


//mathematical tesing with arrays and recursive methods
public class ArrayTesting {
	
	
	
	
	//Test-Main output on Console
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6};
		
		ArrayMath(array);
		
		System.out.println(Quersumme(111,0));
		
		System.out.println(Counting(11111));
		
	
		
		
		
		
	}
	
	//counting the digits from an Integer
	public static int Counting(int num) {
		if (num !=0) {
			
			return 1 + Counting(num/10);}
		return 0;
		
	}

	//Method for the digital root from an Integer
	public static int Quersumme(int h, int start) {
		if (h !=0) {
			start += h%10;
			return Quersumme(h/10,start);
		}
		return start;
		
		
	}
	
	
	//median, average, smallest and highest number
	public static void ArrayMath(int [] array) {
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
		if (array.length%2==0) {
			median = (array[array.length/2]+array[array.length/2-1])/2.0;
		}
		else {median = array[array.length/2];}
		System.out.println("Median = " + median);
		
	}
	
	
	
	
	
	
}

