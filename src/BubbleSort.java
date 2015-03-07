
public class BubbleSort {

	public static void main(String[] args) {
		
			int arr[] = {12,424,45,56,67,7,4,7,68,57,7,68,78,56};
			
			int a =3;
			int b = 4;
			
		arr = bubbleSort(arr);
			System.out.println("Sorted array is: ");
			for(int i: arr){
				System.out.print(" "+i);
			}
		

	}

	private static int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j< (arr.length-i-1);j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		return arr;
	}

	

	

}
