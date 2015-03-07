
public class MergeSort {

	
	public static void main(String[] args) {
		
		int arr[] = {6,4,36,3,6,7,3,7,73,26,3,6,2,-3,-4,5,72,6,2,7,3,6,73,7,73,3};
		System.out.println("Sorted array is: ");
		arr = mergesort(arr);
		for(int i: arr){
			System.out.print(" "+i);
		}
		
		
	}

	
	private static int[] mergesort(int[] arr) {
		
		if(arr.length<=1){
			return arr;
		}
		int first[] = new int[arr.length/2];
		int second[] = new int[arr.length-first.length];
		
		System.arraycopy(arr, 0, first, 0, first.length);
		System.arraycopy(arr, first.length, second, 0, second.length);
		
		mergesort(first);
		mergesort(second);
		
		merge(first,second,arr);
		return arr;
		
	}

	private static int[] merge(int[] first, int[] second, int[] arr) {
		int iFirst =0;
		int iSecond =0;
		int iarr = 0;
		while(iFirst < first.length && iSecond < second.length){
			if(first[iFirst]<second[iSecond]){
				arr[iarr] = first[iFirst];
				iFirst++;
			}else{
				arr[iarr] = second[iSecond];
				iSecond++;
			}
			iarr++;
		}
		System.arraycopy(first, iFirst, arr, iarr, first.length-iFirst);
		System.arraycopy(second, iSecond, arr, iarr, second.length-iSecond);
		
		return arr;
	}

	
	
}
