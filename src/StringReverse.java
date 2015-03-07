
public class StringReverse {
	
	public static void main(String args[]){
		
		String str = "abccccc";
		
		
		StringBuilder strb = new StringBuilder(str);
		System.out.println("Reversed string usingSbuilder API: " +strb.reverse());
		
		//System.out.println("Substring : " +str.substring(1,4));
		char[] charr = str.toCharArray();
		StringBuilder strb2 = new StringBuilder();
		for(int i=str.length(); i>0; i--){
			 
			strb2.append(charr[i-1]);
			
		}
		System.out.println("Reversed string w/o usingSbuilder API: " +strb2);
		
		System.out.println("Reversed string recursive: " +reverse(str));;
	}

	private static String reverse(String str) {
		if(str.length() == 1)
			return str;
		return reverse(str.substring(1))+ str.charAt(0);
		
	}
}
