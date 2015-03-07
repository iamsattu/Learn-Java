
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 11122;
			while(!ispalindrome(n))
				n++;
			
			System.out.println("Next Palindrome is " +n);
			
			
	}

	private static boolean ispalindrome(int n) {
		int intial = n;
		int rev=0;
		 if(intial==reverse(n,rev)){
		 return true;
		 }
		 else {
			 return false;
		 }
	}

	private static int reverse(int n, int rev) {
		
		if(n/10==0)return (rev*10)+n%10;
		else{
			rev=(rev*10)+n%10;
			return reverse(n/10,rev);
		}
			
		
	}

	

}
