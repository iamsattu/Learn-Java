import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int[] temp = new int[20];
		int n = 3;
		int j = 0;
		int k = arr.length-1;
		//System.out.println("arr sizeis: "+(temp[0]=arr[8]));
		for(int i=arr.length-1;i>=0;i--){
			if(i>=(arr.length-n))
			{
				temp[j]=arr[i];
				j++;
			}else{
			arr[k]=arr[i];
			k--;
			}
		}
		System.out.println("arr is: ");
		
		for(int i : arr){
			System.out.print(" "+i);
		}
		for(int i : temp){
			System.out.print(" "+i);
		}
	}

}
