
public class InsertionSort {
	
	public static void main(String args[]){
		
		int arr[] = {6,4,36,3,6,7,3,7,73,26,3,6,2,-3,-4,5,72,6,2,7,3,6,73,7,73,3};
		
		arr = insertionSort(arr);
		
		System.out.println("Sorted array is: ");
		for(int i: arr){
			System.out.print(" "+i);
		}
	
	}

	private static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
			
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
		return arr;
	}

}
