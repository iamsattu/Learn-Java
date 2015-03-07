
public class ContijuousSubArray {

	public static void main(String[] args) {
		
		int num[] = {-1,-2,-3};
		
		int i=0;
		int j=0;

		int maxsofar = 0;
		int maxarr = 0;
		
		for(int k=0;k<num.length;k++){
			maxarr = maxarr+num[k];
			if(maxarr<0){
				maxarr=0;
			}
			if(maxarr>maxsofar){
				maxsofar = maxarr;
			
			}
		}
		
		int currsum= num[0];
		int currmaxsofar = num[0];
		for(int k =1;k<num.length;k++){
			currsum = maximum(num[k],currsum+num[k]);
			currmaxsofar = maximum(currsum,currmaxsofar);
			System.out.println("Total Max Sum so far: "+currmaxsofar);
		}
		System.out.println("Total Max Sum: "+maxsofar);
		System.out.println("Total sum : "+currmaxsofar);
	}

	private static int maximum(int i, int j) {
		if(i>=j){
			return i;
		}else{
			return j;
		}
		
	}

}
