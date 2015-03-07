
public class TestException {

	public static void main(String[] args) {
		
		
		try{
			System.out.println("I am in try");
			System.exit(0);
			System.out.println("I am in after try");
			
		}catch(Exception e){
			
		}finally{
			
			System.out.println("I am in finally");
		}	
		
	}
}
