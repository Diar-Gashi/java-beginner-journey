package dd;

public class BinarySearching {
	
	
	
	public static double[] bubbleSorting(double [] array) {
		
		double temp;
		
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
	
//binary search method
	public static int binarySearching(double [] array, double key) {
	int left = 0;
	int right = array.length-1;
	int mid;
	
	while (left<=right) {
		mid = (left+right)/2;
		
		if (array[mid] == key) {
			return mid;
			
		}
		if (array[mid]> key) {
			right = mid -1;
		}
		
		else {
			left = mid +1;
		}
		
	
	}
	return -1;  //nothing found
}

	// Test- Main with unsorted example of an double array
	public static void main(String[] args) {
		
		double [] test = {1.5,5.9,5.8,11.4,1.4,22.7,19.2,4,5.1,2};
		
		//sorting the Array
		test = bubbleSorting(test);
		
		// Test-Output
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		
		double Key = 5.9; //example looking for the index
		
		System.out.println();//break
		System.out.println(binarySearching(test,Key)); // array index Output(array start with 0)
		
		
	}

}
