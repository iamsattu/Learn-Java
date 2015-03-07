
public class Fibnocci {
	
	public static void main(String args[]){
		
		int n=3;
		for(int i=0; i<=n; i++){
		System.out.println(fib(i));
		}
		int a=0;
		int b=1;
		
		if(n==0)
			System.out.println("0");
		else if(n==1)
			System.out.println("0 1");
		else{
			 System.out.print("0 1 ");
		for(int i=1; i<n-1; i++){
			
				int next = a+b;
				System.out.print(next+ " ");
				a=b;
				b = next;		
			}
			
			
		}
		
	}

	private static int fib(int n) {
	
		if(n==0 )
			return 0;
		else if(n==1)
			return 1;
		else{
			return  (fib(n-1)+fib(n-2));
		}
			
		
	}

}


