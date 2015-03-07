import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


class  TestSync implements Runnable{
	static Vector<Integer> v = new Vector();
	static boolean first = true;
	@Override
	public void run() {
		
		for(int i=1; i<=10;i++){
			TestSync.v.add(i);
			try {
				if(TestSync.first && i==5){
					first = false;
					Thread.currentThread().sleep(100);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Merc","Audi","BMW", "Porshe","Mustang","Merc"};
		
	/*	ArrayList<String> arrayList = new ArrayList();
		arrayList.addAll(Arrays.asList(cars));
		Collections.sort(arrayList);
		for(String s : arrayList){
			System.out.print(" "+s);
		}
		
		System.out.println();
		
		LinkedList<String> linkedList =  new LinkedList();
		linkedList.addAll(Arrays.asList(cars));
		for(String s : linkedList){
			System.out.print(" "+s);
		}
		
		
		
		Set<String> carSet = new HashSet(arrayList);
		System.out.println();
		
		for(String s : carSet){
			System.out.print(" "+s);
		}
		
		Set<String> carlSet = new LinkedHashSet(linkedList);
		System.out.println();
		
		for(String s : carlSet){
			System.out.print(" "+s);
		}
		
		Set<String> cartSet = new TreeSet(linkedList);
		System.out.println();
		
		for(String s : cartSet){
			System.out.print(" "+s);
		}
		*/
		
		Thread t1= new Thread(new TestSync());
		Thread t2= new Thread(new TestSync());
		t1.start();
	
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		for(Integer s : TestSync.v){
			System.out.print(" "+s);
		}
	}

}
