import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingleTon implements Serializable{
	private static SingleTon instance = null;
	static boolean first = true;
	int var= 2;
	private SingleTon(){
	}
	static SingleTon getInstance(){
		if(instance == null){
			if(first){
				first = false;
				try {
					Thread.currentThread().sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			synchronized(SingleTon.class){
				if(instance == null)
				instance = new SingleTon();
			}
		}
		return instance;
	}
	
	private Object readResolve(){
		return instance;
		
	}
	
	
}
class TestMultiTh implements Runnable{

	@Override
	public void run() {
		SingleTon s1 = SingleTon.getInstance();
		System.out.println("Instance created is: "+s1);
	}
	
	
	
}
public class SingleTonTest  {
		public static void main(String args[]){
		
			/*
			Thread t1 = new Thread(new TestMultiTh());
			Thread t2 = new Thread(new TestMultiTh());
			t1.start();
			t2.start();*/
			
			
			SingleTon s1 = SingleTon.getInstance();
			try {
				FileOutputStream fos = new FileOutputStream("Serialized");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(s1);
				
				FileInputStream fis = new FileInputStream("Serialized");
				ObjectInputStream ois = new ObjectInputStream(fis);
				SingleTon s2 = (SingleTon) ois.readObject();
				System.out.println(s1);
				System.out.println(s2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
