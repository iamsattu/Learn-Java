
public class MergeSortPractice {

	public static void main(String[] args) {
		int arr[] = {12,424,45,56,67,7,4,7,68,57,7,68,78,56};
		
		arr = dividemerge(arr);
		
		System.out.println("Sorted array is: ");
		for(int i: arr){
			System.out.print(" "+i);
		}
	}

	private static int[] dividemerge(int[] arr) {
		if(arr.length<=1){
			return arr;
		}
		int n = arr.length;
		int first[] = new int[n/2];
		int sec[] = new int[n-n/2];
		
		System.arraycopy(arr, 0, first, 0, first.length);
		System.arraycopy(arr, first.length, sec, 0, sec.length);
		
		dividemerge(first);
		dividemerge(sec);
		
		arr = merge(first,sec,arr);
		return arr;
		
		
	}

	private static int[] merge(int[] first, int[] sec, int[] arr) {
		
		int i = 0,j = 0;
		int aid =0;
		
			
			while(i< first.length && j<sec.length){
				
				if(first[i]<sec[j]){
					arr[aid] = first[i];
					i++;
				}
				else{
					arr[aid] = sec[j];
					j++;
				
				}
				aid++;
		}
			
		System.arraycopy(first, i, arr, aid, first.length - i);
		System.arraycopy(sec, j, arr, aid, sec.length - j);
		return arr;
	}
	
	

}
