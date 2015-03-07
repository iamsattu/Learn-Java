
public class Testhash {
	
	public static void main(String args[]){
	
	Emp e1 = new Emp(1,"Satish");
	Emp e2 = new Emp(1,"Satish");
	boolean flag = e1==e2;
	System.out.println("Compare two objects: "+e1);
	System.out.println("Compare two objects: "+e1.equals(e2));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp" +hashCode();
	}

	
	
	
	
}
class Emp{
	
	int empid;
	String empname;
	Emp(int empid,String empname){
		this.empid =empid;
		this.empname=empname;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empid;
	}
	
	

	@Override
	public boolean equals(Object e) {
		// TODO Auto-generated method stub
				if(this.empid == ((Emp)e).empid){
					return true;
				}
				else 
					return false;
	
	}
	
}
