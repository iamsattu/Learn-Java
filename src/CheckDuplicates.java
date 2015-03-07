import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CheckDuplicates {
	
	
	public static void main(String a[]){
		
	String duplicates[] = {"one", "two", "three", "one"};
	String noduplicates[] = {"one", "two", "three"};
	
	List list = Arrays.asList(noduplicates);
	Set set = new HashSet(list);
	
	for(String str : duplicates){
		System.out.println("Equal or not: " + (set.add(str)));
		
	}
	System.out.println("Equal or not: " + (set.size() == list.size()));
	
	
		
	}
	
	
	
	

}
