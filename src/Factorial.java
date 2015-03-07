
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		System.out.println("Factorial value is:"+fact(n));

	}

	private static int fact(int n) {
		
		if(n==1) return 1;
		else{
			return n* fact(n-1);
		}
		
	}

	

}


