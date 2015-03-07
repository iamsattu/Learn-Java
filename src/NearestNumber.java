import java.util.Arrays;


public class NearestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9876549;
		int num =n;
		int left=0;
		int right=0;
		int temp=0;
		int curr = 0;
		while(num>0){
			System.out.println("Number is: "+num);
			
			curr = num%10;
			System.out.println("Current is:"+curr+" and "+"Previoius is: "+temp);
			if(curr>=temp){
				temp = curr;
				right=right*10+curr;
				num = num/10;
				
			}else{
				left=num;
				break;
			}
		}
		
		System.out.println("Current" + left);
		System.out.println("PRev" + right);

		nearest(left, right, curr, temp);
		
	}

	private static void nearest(int left, int right, int curr, int temp) {

		char[] larr = String.valueOf(left).toCharArray();
		char[] rarr = String.valueOf(right).toCharArray();
		char[] currarr = String.valueOf(curr).toCharArray();
		char min = rarr[0];
		
		int swapindex =0;
		Arrays.sort(rarr);
		for(int i=0; i<rarr.length;i++){
			if((rarr[i]>=currarr[0])){
				min= rarr[i];
				swapindex = i;
			}
			
		}
		char temp1 = rarr[swapindex];
		rarr[swapindex]=currarr[0];
		larr[larr.length-1] = temp1;
		
		
		System.out.println("Left arr" + new String(larr));
		System.out.println("Right arr" + new String(rarr));
		System.out.println("Minchar" + min);
		System.out.println("Final String: "+new String(larr) + new String(rarr));
	
	}

}

