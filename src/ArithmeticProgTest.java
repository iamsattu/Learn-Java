import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ArithmeticProgTest {
	public static void main(String args[]){
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n;
	        try {
				n = Integer.parseInt(br.readLine());
			
	        int arr[] = new int[n];
	        int sum = 0;
	        String numbers[] = br.readLine().split(" ");
	        
	        for (int i = 0; i < n; i++) {
	        	arr[i] = Integer.parseInt(numbers[i]);
	        	sum+= arr[i];
	        }
	        
	        int ARSum = ((n+1)* (arr[0]+arr[n-1]))/2;
	        System.out.println(ARSum-sum);
	        
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
