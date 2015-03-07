
public class BinarySearchPractice {

	public static void main(String[] args) {
		

		int arr[] = {4,7,7,7,12,45,56,56,57,67,68,68,78,424};
		
		int key = 56;
		
		int found = binarysearchfor(arr,0,arr.length-1,key);
		System.out.println("Found element is: "+found);

	}

	private static int binarysearchfor(int[] arr, int start, int end, int key) {
			int mid = (start+end)/2;
			if(start>end){
				return -1;
			}
			if(arr[mid]==key){
				System.out.println("FOund at  is "+mid);
				return mid;
			}
			if(arr[mid]>key){
				return binarysearchfor(arr,start, mid-1, key);
			}else{
				return binarysearchfor(arr,mid+1, end, key);
			}
		
			
			
		
	}

}
