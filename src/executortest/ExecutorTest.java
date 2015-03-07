package executortest;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class ExecutorTest {

	public static void main(String[] args) {
		
		CallableClass c1 = new CallableClass();
		CallableClass c2 = new CallableClass();
		CallableClass c3 = new CallableClass();
		
		List<CallableClass> callablelist = new ArrayList<CallableClass>();
		callablelist.add(c1);
		callablelist.add(c2);
		callablelist.add(c3);
		
		
		ExecutorService executor1 = Executors.newFixedThreadPool(4);
		
		try {
			//executor1.invokeAll(callablelist, 100, TimeUnit.MILLISECONDS);
			
			
			  List<Future<Integer>> futures = executor1.invokeAll(callablelist, 10, TimeUnit.MILLISECONDS);
			  System.out.println("Completed execution");
		        int flag = 0;

		        for (Future<Integer> f : futures) {
		            Integer res = f.get();
		            System.out.println("Sum is: " + res);
		            if (!f.isDone()) 
		                flag = 1;
		        }

		        if (flag == 0)
		            System.out.println("SUCCESS");
		        else
		            System.out.println("FAILED");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (CancellationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
