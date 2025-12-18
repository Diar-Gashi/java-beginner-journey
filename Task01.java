

//Magisches Quadrat programmed on Eclipse IDE
public class Task01 {
	
	public static boolean MagischesQuadrat(int [][]arr) 
	{
		int sum = 0;
	
	int start = arr[0][0];
	
		if (arr.length != arr[0].length){
			return false;
		}
		for (int i = 0; i<arr.length;i++) {
			sum += arr[0][i];
		}
		if (!CheckSumZeile(arr,sum)) {
			return false;
		}
		if (!CheckSumSpalte(arr,sum)) {
			return false;
		}if (!CheckDiagonal(arr,sum)) {
			return false;
		}
		return true;
		
		
		
	}
			
	public static boolean CheckSumZeile(int arr [][], int sum)	{
		int tempsum;
		boolean temp = true;
		for (int i = 1; i<arr.length;i++) {
			tempsum = 0;
			for (int j = 0;j<arr.length;j++) {
				tempsum += arr[i][j];
				
				
			}
			if (sum!=tempsum){temp = false;}
			
		}
		return temp;
	}
	
	public static boolean CheckDiagonal(int arr[][] ,int sum) {
		
		int tempsum = 0;
		int tempsum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			 
				tempsum+=arr[i][i];	
				tempsum2 += arr[i][arr.length-1-i];
				
			}
		
		if (tempsum != tempsum2 || sum!=tempsum) {
			return false;
		}
		return true;
	}
	public static boolean CheckSumSpalte(int arr [][], int sum)	{
		int tempsum;
		boolean temp = true;
		for (int i = 0; i<arr.length;i++) {
			tempsum = 0;
			for (int j = 0;j<arr.length;j++) {
			tempsum += arr[j][i];
				
				
			}
			if (sum!=tempsum){temp = false;}
			
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
	int [][] arr = {{1,1,1},{1,1,1},{1,1,1}};
	System.out.print(MagischesQuadrat(arr));
		
	
	
	
		
	}

}
