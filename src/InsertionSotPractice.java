
public class InsertionSotPractice {

	public static void main(String[] args) {
		int arr[] = {12,424,45,56,67,7,4,7,68,57,7,68,78,56};
		
		insertionsort(arr);
		

	}

	private static void insertionsort(int[] arr) {
		
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = i;
			for(int j =i-1;j>=0;j--){
				if(arr[j]>arr[j+1]){
					swap(arr,j+1,j);
				}
			}
		}
		
		for(int i: arr){
			System.out.print(" "+i);
		}
	}
	
	private static void swap(int arr[],int i, int min) {
		arr[i] = arr[i]^arr[min];
		arr[min] = arr[i]^arr[min];
		arr[i] = arr[i]^arr[min];
	
	}

}
