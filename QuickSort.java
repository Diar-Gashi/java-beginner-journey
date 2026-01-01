package dd;
import java.util.Arrays;

public class QuickSort {
	
	//public quicksort method
	public static int[] quickSort(int[] array) {
        if (array == null || array.length < 2) return array;
        devideArray(array, 0, array.length - 1);
        return array;
    }
	
	//array partition
	private static int[] devideArray(int[] array, int left, int right) {
	    int pivot = medianOfThreeValue(array, left, right);

	    int i = left;
	    int j = right;

	    while (i <= j) {
	        while (array[i] < pivot) i++;
	        while (array[j] > pivot) j--;

	        if (i <= j) {
	            swap(i, j, array);
	            i++;
	            j--;
	        }
	    }

	  
	    if (left < j) devideArray(array, left, j);
	    if (i < right) devideArray(array, i, right);

	    return array;
	}
	
	//swaping the elements of an array
	private static void swap(int low, int high, int array[]) {
		int temp = array[low];
		array[low] = array[high];
		array[high] = temp;
	}
	
	
	 private static int medianOfThreeValue(int[] array, int links, int rechts) {
	        int mid = links + (rechts - links) / 2;

	        int a = array[links];
	        int b = array[mid];
	        int c = array[rechts];

	        // median of a,b,c
	        if ((a <= b && b <= c) || (c <= b && b <= a)) return b;
	        
	        if ((b <= a && a <= c) || (c <= a && a <= b)) return a;
	        
	        return c;
	    }
	
	
	
	
	public static void main(String[] args) {
		
		int test [] = {1,5,4,68,34,5,8,3,2};
		int[] copy = Arrays.copyOf(test, test.length);

		
		//using my method
		test = quickSort(test);
		
		//using java imported quicksort
		Arrays.sort(copy);
		
		
		//comparing the results
		boolean Check = true;
		
		for (int i = 0; i < copy.length; i++) {
			if (test[i]!= copy[i]) {Check = false;}
		}
		System.out.println(Check);
		
	
			
			
			
		}
	}


