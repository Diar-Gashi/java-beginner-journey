package Beginn;



public class BubbleSort {
	
	//Reversing the Array : O(n)
	public static int[] ReverseArray(int [] array, int start, int end) {
		
		int temp;
		if (end - start > 0) {
			
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			return ReverseArray(array,start+1,end-1);
		}
		
		return array;
	}
	
	
	//Sorting the Array: O(n^2)
	public static int[] BubbleSorting(int [] array) {
		
		int temp;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j]> array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					
				}
			}
		}
		return array;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//unsorted array to test the methods
		int [] test = {1,7,3,9,8};
		
		test = ReverseArray(test,0,test.length-1);
		
		//Output for Reversed Array
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		
		//Sorting the Array with Bubble Sort
		test = BubbleSorting(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		
		
	}
}
