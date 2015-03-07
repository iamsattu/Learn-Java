package executortest;
import java.util.concurrent.Callable;

import javax.sql.rowset.spi.SyncResolver;


public class CallableClass implements Callable<Integer>{
private static  boolean firstThread = true;
	@Override
	public Integer call() throws Exception {
		Integer sum = 0;
		System.out.println("Inside call !! Current Thread called is: "+Thread.currentThread().getName());
		
			System.out.println("Thread  "+Thread.currentThread().getName() +" slept");
			for (int i = 0; i < 1000000; i++) {
                sum += i;
            }

			
	
		System.out.println("Outside call !! Current THread called is: "+Thread.currentThread().getName());
		
		      return sum;
		    }
	}


