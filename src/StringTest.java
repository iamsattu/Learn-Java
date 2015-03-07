import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;


public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1[] = {"black","blue","red","green","yellow", "yellow"};
		String s2[] = {"brown","blue","yellow","green","yellow","yellow"};
		// black red brown yellow
		List<String> strset = new LinkedList();
		List<String> strset2 = new LinkedList();
		strset.addAll(Arrays.asList(s1));
		strset2.addAll(Arrays.asList(s1));
	
		for(String s : s2){
			if(strset.contains(s)){
				if(!strset2.remove(s)){
					strset2.add(s);
				}
					
			}else{
				strset2.add(s);
			}
		}
		

		for(String s :strset2){
			System.out.print(" "+s);
		}

	}

}
