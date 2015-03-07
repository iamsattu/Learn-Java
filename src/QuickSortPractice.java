
public class QuickSortPractice {
	
	
	public static void main(String args[]){
		
		int arr[] = {5,4,3,2,1};
		
		
		
		 quickSort(arr,0,arr.length-1);
		System.out.println("Sorted array is: ");
		for(int i: arr){
			System.out.print(" "+i);
		}
	

		
	}

	private static void quickSort(int[] arr,int low,int high) {
	
		int pivot = arr[(low+high)/2];
		int i = low;
		int j = high;
		int temp;
		while(i<j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<j){
				
				System.out.println("SWAPPING  "+ arr[i] + " and " +arr[j]);
				
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
				System.out.println("Values are  "+ arr[i] + " and " +arr[j]);
				i++;j--;
			}
		}
		if(i<high){
			 quickSort(arr,i++,high);
		}
		if(j>low){
			 quickSort(arr,low,j--);
		}
		
		
		
		
	}
	
	private static void swap(int arr[],int i, int min) {
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}

}
