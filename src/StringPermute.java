import java.util.Arrays;


public class StringPermute {

	public static void main(String args[]){
		String str = "ABC";
		char[] chstr = str.toCharArray();
		int pointswap = 0; 
		for(int i=0;i<chstr.length;i++){
			
			swap(chstr,pointswap,i);
		}
		System.out.println("Swapped String: "+str);
		System.out.println("Swapped String: "+Arrays.toString(chstr));
		
	}

	private static void swap(char[] chstr, int pointswap, int i) {
		char temp;
		temp = chstr[i];
		chstr[i] = chstr[pointswap];
		chstr[pointswap]=temp;
				
		
	}
	
}

ABC

ABC    i = 0 , pointswap 0
		


