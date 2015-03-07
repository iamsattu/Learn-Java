
public class SelectionSort {

	public static void main(String[] args) {
		

		int arr[] = {12,424,45,56,67,7,4,7,68,57,7,68,78,56};
		
		selectionSort(arr);
		

	}

	private static void selectionSort(int[] arr) {
		int min;
	
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			min = i;
		
			boolean min_changed=false;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
					min_changed=true;
				//	System.out.println("Min element on "+j+"th iteration is "+ arr[min]);
				}
			}
		
			if(min_changed){
				swap(arr, i, min);
			/*	System.out.println("SWAPPING  "+ arr[i] + " and " +arr[min]);
			arr[i]=arr[i]^arr[min];
			System.out.println("Values are  "+ arr[i] + " and " +arr[min]);
			arr[min]=arr[i]^arr[min];
			System.out.println("Values are  "+ arr[i] + " and " +arr[min]);
			arr[i]=arr[i]^arr[min];
			System.out.println("Values are  "+ arr[i] + " and " +arr[min]);*/
			}
		}
		for(int a: arr)
			System.out.print(" "+a);
	}

	private static void swap(int arr[],int i, int min) {
		arr[i] = arr[i]^arr[min];
		arr[min] = arr[i]^arr[min];
		arr[i] = arr[i]^arr[min];
	
	}

}
