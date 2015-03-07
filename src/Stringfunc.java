
public class Stringfunc {

	public static void main(String[] args) {
		
		
		String s1 = "Hi";
		String s2= s1;
		s2+="c";
		String str1 = new String("Hi");
		String str2 = str1;
		str2+="c";
		StringBuffer strb1 = new StringBuffer("Hi");
		StringBuffer strb2 =strb1;
		strb2.append("c");
		boolean flag = strb1 == strb2;
		System.out.println(" "+s1 +" " +s2);
		System.out.println(" "+str1+" "+str2);
		System.out.println(" "+ (strb1+" "+strb2));
		System.out.println(" "+ (flag));
	}

}
