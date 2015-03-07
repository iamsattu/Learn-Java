
public class QuickSort {
	
	public static void main(String args[]){
		
		int arr[] = {5,4,3,2,1};
		
		quicksort(arr, 0 ,arr.length-1);
		
		System.out.println("Sorted array is: ");
		for(int i: arr){
			System.out.print(" "+i);
		}
		
	}

	private static void quicksort(int[] arr, int low, int high) {
		
		int  i =low;
		int j = high;
		int pivot = arr[(low+high)/2];
		
		while(i<=j){
			while(arr[i] <pivot){
				i++;
			}
			while(arr[j] >pivot){
				j--;
			}
			if(i<=j){
				Swapping 
				arr[i]=arr[i]^arr[j];
				arr[j]=arr[i]^arr[j];
				arr[i]=arr[i]^arr[j];
				i++;j--;
			}
			
		}
		if(low<j)
		quicksort(arr,low,j);
		if(i<high)
		quicksort(arr,i,high);
	}

}
