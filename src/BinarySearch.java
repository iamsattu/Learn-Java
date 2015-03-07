
public class BinarySearch {
	
	public static void main(String args[]){
		
		int arr[] = {2,3,5,11,14,36,77,78,80};
		
		int srch = 36;
		
		int index = binarysearch(arr,srch,0,arr.length);
		System.out.println("Found at: "+index++);
		
	}

	private static int binarysearch(int arr[],int i,int low,int high) {
		
		System.out.println("Low value: "+low+" High value: "+high);
		int mid = (high+low)/2;
		System.out.println("Mid value: "+mid);
		if(low>high){
			return -1;
		}
		if(arr[mid]==i){
			return mid;
		}
		if(arr[mid]> i){
			return binarysearch(arr,i,low,mid);
		}else{
			return binarysearch(arr,i,mid+1,high);
		}
		
	
	}

}
